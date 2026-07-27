class Solution {
    public String reverseVowels(String s) {
        String vowels="aeiouAEIOIU";
        String rev="";
        for(char ch:s.toCharArray()){
            if(vowels.contains(ch+"")){
                rev=ch+rev;
            }
        }
        char[] charr=s.toCharArray();
        int index=0;
        for(int i=0;i<charr.length;i++){
            if(vowels.contains(charr[i]+"")){
                charr[i]=rev.charAt(index++);
            }
        }
        return String.valueOf(charr);
    }
}