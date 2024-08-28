// task №2631

/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
    let arr = this;
    let result = {};
    for (let i = 0; i < arr.length; i++) {
        let key = fn(arr[i]);
        result[key] ? result[key].push(arr[i]) : result[key] = [arr[i]]
    }
    return result
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */
