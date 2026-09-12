/**
 * @param {number[]} nums
 * @return {number[]}
 */
var concatWithReverse = function(nums) {
    let arr=[];
    for(let i=nums.length-1;i>=0;i--){
        arr.push(nums[i]);
    }
    return nums.concat(arr);
    
};