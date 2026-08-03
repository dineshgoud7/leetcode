class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new LinkedHashMap<>();
        for(String ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        String res="";
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                count++;
                if(count==k){
                    res=entry.getKey();
                    return res;
                }
            }
        }
        return res;
    }
}