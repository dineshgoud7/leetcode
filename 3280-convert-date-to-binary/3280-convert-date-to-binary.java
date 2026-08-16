class Solution {
    public String convertDateToBinary(String date) {
        String[] str=date.split("-");
        String res="";
        for(int i=0;i<str.length;i++){
            int num=Integer.parseInt(str[i]);
            String s=Integer.toBinaryString(num);
            res+=s;
            if(i<=str.length-2){
                res+="-";
            }
        }
        return res;
    }
}