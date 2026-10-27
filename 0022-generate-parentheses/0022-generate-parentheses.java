class Solution {

    public static void valid(String s,int open,int close,int n,List<String> list){
        if(s.length()==2*n){
            list.add(s);
            return;
        }
        if(open<n){
            valid(s+'(',open+1,close,n,list);
        }
        if(close<open){
            valid(s+')',open,close+1,n,list);
        }
    }
    public List<String> generateParenthesis(int n) {
        String res="";
        List<String> list=new ArrayList<>();
        valid(res,0,0,n,list);
        return list;
    }
}