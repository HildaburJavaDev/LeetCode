// task № 2704

/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        toBe: (val_2) => {
            if (val === val_2) {
                return true;
            } else {
                throw new Error("Not Equal");
            }
        },
        notToBe: (val_2) => {
            if (val !== val_2) {
                return true;
            } else {
                throw new Error("Equal");
            }
        }
    }
};


/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */
