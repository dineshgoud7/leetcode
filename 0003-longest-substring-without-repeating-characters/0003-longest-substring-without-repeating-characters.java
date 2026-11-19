class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int max=0;
        int index=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else{
                if(set.size()>=max){
                    max=set.size();
                    set.clear();
                    index++;
                    i=index;
                    set.add(s.charAt(i));
                }else{
                    set.clear();
                    index++;
                    i=index;
                    set.add(s.charAt(i));
                }
            }
            if(set.size()>max){
                max=set.size();
            }
        }
        return max;
    }
}