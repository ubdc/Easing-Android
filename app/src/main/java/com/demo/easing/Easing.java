package com.demo.easing;

/**
 * the effect: http://easings.net/
 */
public enum Easing {
    easeInSine {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInSine(elapsedTime, startPosition, distance, duration);
        }
    },
    easeOutSine {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeOutSine(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInOutSine {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInOutSine(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInQuad {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInQuad(elapsedTime, startPosition, distance, duration);
        }
    },
    easeOutQuad {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeOutQuad(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInOutQuad {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInOutQuad(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInCubic {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInCubic(elapsedTime, startPosition, distance, duration);
        }
    },
    easeOutCubic {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeOutCubic(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInOutCubic {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInOutCubic(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInQuart {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInQuart(elapsedTime, startPosition, distance, duration);
        }
    },
    easeOutQuart {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeOutQuart(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInOutQuart {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInOutQuart(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInQuint {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInQuint(elapsedTime, startPosition, distance, duration);
        }
    },
    easeOutQuint {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeOutQuint(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInOutQuint {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInOutQuint(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInExpo {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInExpo(elapsedTime, startPosition, distance, duration);
        }
    },
    easeOutExpo {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeOutExpo(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInOutExpo {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInOutExpo(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInCirc {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInCirc(elapsedTime, startPosition, distance, duration);
        }
    },
    easeOutCirc {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeOutCirc(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInOutCirc {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInOutCirc(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInBack {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInBack(elapsedTime, startPosition, distance, duration);
        }
    },
    easeOutBack {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeOutBack(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInOutBack {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInOutBack(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInElastic {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInElastic(elapsedTime, startPosition, distance, duration);
        }
    },
    easeOutElastic {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeOutElastic(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInOutElastic {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInOutElastic(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInBounce {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInBounce(elapsedTime, startPosition, distance, duration);
        }
    },
    easeOutBounce {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeOutBounce(elapsedTime, startPosition, distance, duration);
        }
    },
    easeInOutBounce {
        public double evaluate (float elapsedTime, float startPosition, float distance, float duration) {
            return EasingFunction.easeInOutBounce(elapsedTime, startPosition, distance, duration);
        }
    };

    public double evaluate(float elapsedTime, float startPosition, float distance, float duration) {
        return 0;
    }

}
