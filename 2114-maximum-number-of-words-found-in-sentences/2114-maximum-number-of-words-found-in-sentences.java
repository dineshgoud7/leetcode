class Solution {
    public int mostWordsFound(String[] sentences) {
        int len=0;
        for(int i=0;i<sentences.length;i++){
            String[] s=sentences[i].split(" ");
            if(len<s.length){
                len=s.length;
            }
        }
        return len;
    }
}