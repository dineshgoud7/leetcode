class Solution {
    public static long findGCD(long a,long b){
        if(b==0) return a;
        return findGCD(b,a%b);
    }
    public long gcdSum(int[] nums) {
        long[] arr=new long[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            arr[i]=findGCD(nums[i],max);
        }
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        long sum=0;
        while(i<j){
            sum+=findGCD(arr[i],arr[j]);
            i++;
            j--;
        }
        return sum;
    }
}