class Solution {
    public int maxDistinct(String s) {
        Set<Character> set=new HashSet<>();
        // for(int i=0;i<s.length();i++){
        //     for(int j=i;j<s.length();j++){
        //         if(!map.containsKey(s.charAt(j))){
        //             map.put(s.charAt(j),s.substring(j));
        //         }
        //     }
        // }

        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        return set.size();
    }
}