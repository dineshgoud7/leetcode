class Solution {

    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=(rev*10)+digit;
            n/=10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();

        int[] arr=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=reverse(nums[i]);

        }
        for(int n:arr){
           set.add(n);
        }
        return set.size();
    }
}