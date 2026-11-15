class Solution {
    public int mostFrequentEven(int[] nums) {
        int res=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(n%2==0){
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        int max=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            if(freq>max || (freq==max && num<res)){
                max=freq;
                res=num;
            }
        }
        return res;
    }
}