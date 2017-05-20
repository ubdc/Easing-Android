package com.demo.easing;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

public class AnimView extends View {
    private Paint basePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Path basePath = new Path();
    private Path path = new Path();
    private long lastTimestamp;
    private int elapseTime;
    private int duration = 2000;
    private int verticalPadding;
    private int horizontalPadding;
    private Easing easing = Easing.easeInOutBounce;

    public AnimView(Context context) {
        super(context);
        setup();
    }

    public AnimView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setup();
    }

    public AnimView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setup();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public AnimView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setup();
    }

    private void setup() {
        basePaint.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.STROKE);
        circlePaint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(3);
        basePaint.setColor(0xff333333);
        paint.setColor(0xff33ff33);
        circlePaint.setColor(0xffff2222);
        basePaint.setTextSize(32);
        basePaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w != oldw || h != oldh) {
            horizontalPadding = w / 10;
            verticalPadding = h / 4;
            basePath.reset();
            basePath.moveTo(horizontalPadding, h - verticalPadding);
            for (int i = horizontalPadding; i <= w - horizontalPadding; i++) {
                basePath.lineTo(i, (float) easing.evaluate(i - horizontalPadding, h - verticalPadding, verticalPadding * 2 -h, w - horizontalPadding * 2));
            }
            path.reset();
            path.moveTo(horizontalPadding, h - verticalPadding);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int w = getWidth();
        int h = getHeight();
        canvas.drawLine(0, verticalPadding, w, verticalPadding, basePaint);
        canvas.drawLine(0, h - verticalPadding, w, h - verticalPadding, basePaint);
        canvas.drawLine(horizontalPadding, 0, horizontalPadding, h, basePaint);
        canvas.drawLine(w - horizontalPadding, 0, w - horizontalPadding, h, basePaint);

        if (lastTimestamp == 0) lastTimestamp = System.currentTimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        elapseTime += currentTimeMillis - lastTimestamp;
        lastTimestamp = currentTimeMillis;
        if (elapseTime > duration) {
            elapseTime -= duration;
            path.reset();
            path.moveTo(horizontalPadding, h - verticalPadding);
        }

        float x = horizontalPadding + (w - horizontalPadding * 2) * (1f * elapseTime / duration);
        float y = (float) easing.evaluate(elapseTime, h - verticalPadding, verticalPadding * 2 -h, duration);
        path.lineTo(x, y);

        canvas.drawPath(basePath, basePaint);
        canvas.drawPath(path, paint);
        canvas.drawCircle(x, y, 10, circlePaint);

        canvas.drawText(easing.toString(), w / 2, h - verticalPadding / 2, basePaint);
        invalidate();
    }

    public void setEasing(Easing easing) {
        this.easing = easing;
    }
}
