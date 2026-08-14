class Solution {
    public static boolean search(String s,String[] banned){
        for(int i=0;i<banned.length;i++){
            if(banned[i].equals(s)){
                return false;
            }
        }
        return true;
    }
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        paragraph=paragraph.replaceAll("[^a-zA-Z]"," ");
        String[] arr=paragraph.split("\\s+");
        Map<String,Integer> map=new HashMap<>();
        for(String str:arr){
            if(search(str,banned)){
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }
        int max=0;
        String res="";
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                res=entry.getKey();
            }
        }
        return res;
    }
}