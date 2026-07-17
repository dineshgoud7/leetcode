class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pnums=new ArrayList<>();
        ArrayList<Integer> nnums=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nnums.add(nums[i]);
            }else{
                pnums.add(nums[i]);
            }
        }
        int[] arr=new int[nums.length];
        int left=0,right=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=pnums.get(left);
                left++;
            }else{
                arr[i]=nnums.get(right);
                right++;
            }

        }
        return arr;
        
    }
}