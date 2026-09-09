class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;
        int num=nums[0];
        int diff=(nums[nums.length-1]-nums[0]);
        if(++diff==len){
            return list;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=num){
                list.add(num);
                i--;
            }
            num++;
        }
        return list;
    }
}