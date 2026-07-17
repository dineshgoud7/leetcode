class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(pivot>nums[i]){
                list1.add(nums[i]);
            }else if(pivot==nums[i]){
                list2.add(nums[i]);
            }else{
                list3.add(nums[i]);
            }
        }
        int[] arr=new int[nums.length];
        int index=0;
        for(int i=0;i<list1.size();i++){
            arr[index]=list1.get(i);
            index++;
        }
        for(int i=0;i<list2.size();i++){
            arr[index]=list2.get(i);
            index++;
        }
        for(int i=0;i<list3.size();i++){
            arr[index]=list3.get(i);
            index++;
        }
        return arr;
    }
}