class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            list1.add(nums[i]);
        }
        for(int i=n;i<nums.length;i++){
            list2.add(nums[i]);
        }
        int e=0;
        int o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=list1.get(e++);
            }else{
                nums[i]=list2.get(o++);
            }
        }
        return nums;
    }
}