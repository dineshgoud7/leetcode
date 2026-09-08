class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s=s1+" "+s2;
        String[] str=s.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String st:str){
            map.put(st,map.getOrDefault(st,0)+1);
        }
        ArrayList<String> list=new ArrayList<>();

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        return list.toArray(new String[0]);
    }
}