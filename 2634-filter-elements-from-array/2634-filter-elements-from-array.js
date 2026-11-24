/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let res=[]
    let index=0
    for(i=0;i<arr.length;i++){
        val=fn(arr[i],i);
        if(val){
            res[index++]=arr[i]
        }
    }
    return res
    
};