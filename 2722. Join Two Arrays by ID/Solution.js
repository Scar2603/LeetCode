/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    const id = {};
    
    for (const obj of arr1) {
        id[obj.id] = { ...obj };
    }
    
    for (const obj of arr2) {
        if (id[obj.id]) {
            id[obj.id] = { ...id[obj.id], ...obj };
        } else {
            id[obj.id] = { ...obj };
        }
    }
    
    const joined = Object.values(id);
    
    joined.sort((a, b) => a.id - b.id);
    
    return joined;
};
