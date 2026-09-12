/**
 * @param {number[]} nums
 * @return {number[]}
 */
var concatWithReverse = function(nums) {
    let arr=[];
    for(let i=0;i<nums.length;i++){
        arr.push(nums[i]);
    }
    for(let i=nums.length-1;i>=0;i--){
        arr.push(nums[i]);
    }
    return arr;
    
};