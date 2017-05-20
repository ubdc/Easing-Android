package com.demo.easing;

/**
 * refer to: http://easings.net/
 * and it's source: https://github.com/ai/easings.net/blob/master/vendor/jquery.easing.js
 *
 * parameter meaning:
 * t: time elapsed
 * b: start position
 * c: distance from start position
 * d: duration
 * 0 <= t <= d
 */
public class EasingFunction {
    public static double easeInSine(float t, float b, float c, float d) {
        return -c * Math.cos(t / d * (Math.PI / 2)) + c + b;
    }

    public static double easeOutSine(float t, float b, float c, float d) {
        return c * Math.sin(t / d * (Math.PI / 2)) + b;
    }

    public static double easeInOutSine(float t, float b, float c, float d) {
        return c * Math.sin(t / d * (Math.PI / 2)) + b;
    }

    public static double easeInQuad(float t, float b, float c, float d) {
        return c * (t /= d) * t + b;
    }

    public static double easeOutQuad(float t, float b, float c, float d) {
        return -c * (t /= d) * (t - 2) + b;
    }

    public static double easeInOutQuad(float t, float b, float c, float d) {
        if ((t /= d / 2) < 1) return c / 2 * t * t + b;
        return -c / 2 * ((--t) * (t - 2) - 1) + b;
    }

    public static double easeInCubic(float t, float b, float c, float d) {
        return c * (t /= d) * t * t + b;
    }

    public static double easeOutCubic(float t, float b, float c, float d) {
        return c * ((t = t / d - 1) * t * t + 1) + b;
    }

    public static double easeInOutCubic(float t, float b, float c, float d) {
        if ((t /= d / 2) < 1)
            return c / 2 * t * t * t + b;
        return c / 2 * ((t -= 2) * t * t + 2) + b;
    }

    public static double easeInQuart(float t, float b, float c, float d) {
        return c * (t /= d) * t * t * t + b;
    }

    public static double easeOutQuart(float t, float b, float c, float d) {
        return -c * ((t = t / d - 1) * t * t * t - 1) + b;
    }

    public static double easeInOutQuart(float t, float b, float c, float d) {
        if ((t /= d / 2) < 1)
            return c / 2 * t * t * t * t + b;
        return -c / 2 * ((t -= 2) * t * t * t - 2) + b;
    }

    public static double easeInQuint(float t, float b, float c, float d) {
        return c * (t /= d) * t * t * t * t + b;
    }

    public static double easeOutQuint(float t, float b, float c, float d) {
        return c * ((t = t / d - 1) * t * t * t * t + 1) + b;
    }

    public static double easeInOutQuint(float t, float b, float c, float d) {
        if ((t /= d / 2) < 1)
            return c / 2 * t * t * t * t * t + b;
        return c / 2 * ((t -= 2) * t * t * t * t + 2) + b;
    }

    public static double easeInExpo(float t, float b, float c, float d) {
        return (t == 0) ? b : c * Math.pow(2, 10 * (t / d - 1)) + b;
    }

    public static double easeOutExpo(float t, float b, float c, float d) {
        return (t == d) ? b + c : c * (-Math.pow(2, -10 * t / d) + 1) + b;
    }

    public static double easeInOutExpo(float t, float b, float c, float d) {
        if (t == 0) return b;
        if (t == d) return b + c;
        if ((t /= d / 2) < 1) return c / 2 * Math.pow(2, 10 * (t - 1)) + b;
        return c / 2 * (-Math.pow(2, -10 * --t) + 2) + b;
    }

    public static double easeInCirc(float t, float b, float c, float d) {
        return -c * (Math.sqrt(1 - (t /= d) * t) - 1) + b;
    }

    public static double easeOutCirc(float t, float b, float c, float d) {
        return c * Math.sqrt(1 - (t = t / d - 1) * t) + b;
    }

    public static double easeInOutCirc(float t, float b, float c, float d) {
        if ((t /= d / 2) < 1) return -c / 2 * (Math.sqrt(1 - t * t) - 1) + b;
        return c / 2 * (Math.sqrt(1 - (t -= 2) * t) + 1) + b;
    }

    public static double easeInBack(float t, float b, float c, float d) {
        double s = 1.70158;
        return c * (t /= d) * t * ((s + 1) * t - s) + b;
    }

    public static double easeOutBack(float t, float b, float c, float d) {
        double s = 1.70158;
        return c * ((t = t / d - 1) * t * ((s + 1) * t + s) + 1) + b;
    }

    public static double easeInOutBack(float t, float b, float c, float d) {
        double s = 1.70158;
        if ((t /= d / 2) < 1) return c / 2 * (t * t * (((s *= (1.525)) + 1) * t - s)) + b;
        return c / 2 * ((t -= 2) * t * (((s *= (1.525)) + 1) * t + s) + 2) + b;
    }

    public static double easeInElastic(float t, float b, float c, float d) {
        double s;
        double p = d * .3;
        double a = c;
        if (t == 0) return b;
        if ((t /= d) == 1) return b + c;
        if (a < Math.abs(c)) {
            a = c;
            s = p / 4;
        } else {
            s = p / (2 * Math.PI) * Math.asin(c / a);
        }
        return -(a * Math.pow(2, 10 * (t -= 1)) * Math.sin((t * d - s) * (2 * Math.PI) / p)) + b;
    }

    public static double easeOutElastic(float t, float b, float c, float d) {
        double s = 1.70158;
        double p = d * .3;
        double a = c;
        if (t == 0) return b;
        if ((t /= d) == 1) return b + c;
        if (a < Math.abs(c)) {
            a = c;
            s = p / 4;
        } else s = p / (2 * Math.PI) * Math.asin(c / a);
        return a * Math.pow(2, -10 * t) * Math.sin((t * d - s) * (2 * Math.PI) / p) + c + b;
    }

    public static double easeInOutElastic(float t, float b, float c, float d) {
        double s = 1.70158;
        double p = d * (.3 * 1.5);
        double a = c;
        if (t == 0) return b;
        if ((t /= d / 2) == 2) return b + c;
        if (a < Math.abs(c)) {
            a = c;
            s = p / 4;
        } else s = p / (2 * Math.PI) * Math.asin(c / a);
        if (t < 1)
            return -.5 * (a * Math.pow(2, 10 * (t -= 1)) * Math.sin((t * d - s) * (2 * Math.PI) / p)) + b;
        return a * Math.pow(2, -10 * (t -= 1)) * Math.sin((t * d - s) * (2 * Math.PI) / p) * .5 + c + b;
    }

    public static double easeInBounce(float t, float b, float c, float d) {
        return c - easeOutBounce (d-t, 0, c, d) + b;
    }

    public static double easeOutBounce(float t, float b, float c, float d) {
        if ((t/=d) < (1/2.75)) {
            return c*(7.5625*t*t) + b;
        } else if (t < (2/2.75)) {
            return c*(7.5625*(t-=(1.5/2.75))*t + .75) + b;
        } else if (t < (2.5/2.75)) {
            return c*(7.5625*(t-=(2.25/2.75))*t + .9375) + b;
        } else {
            return c*(7.5625*(t-=(2.625/2.75))*t + .984375) + b;
        }
    }

    public static double easeInOutBounce(float t, float b, float c, float d) {
        if (t < d/2) return easeInBounce (t*2, 0, c, d) * .5 + b;
        return easeOutBounce (t*2-d, 0, c, d) * .5 + c*.5 + b;
    }
}
