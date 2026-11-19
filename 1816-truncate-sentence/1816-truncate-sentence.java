class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        String res="";
        for(int i=0;i<k;i++){
            if(i+1==k){
                res+=str[i];
            }else{
                res+=str[i]+" ";
            }
        }
        return res;
    }
}