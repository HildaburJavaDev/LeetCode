// task №2665

/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    var val = init
    return {
        increment: () => {
            return ++val
        },
        reset: () => {
            val = init
            return val
        },
        decrement: () => {
            return --val
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */
