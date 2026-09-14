class Solution {
    public int maxFreqSum(String s) {
        int maxc=0;
        int maxv=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxv && "aeiou".contains(entry.getKey()+"")){
                maxv=entry.getValue();
            }
            if(entry.getValue()>maxc && !"aeiou".contains(entry.getKey()+"")){
                maxc=entry.getValue();
            }
        }
        return maxc+maxv;
    }
}