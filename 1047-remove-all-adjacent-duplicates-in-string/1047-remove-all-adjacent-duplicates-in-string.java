class Solution {
    public String removeDuplicates(String s) {
        if(s.length()==0) return "";
        Stack<Character> stack=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{
                if(stack.peek()==s.charAt(i)){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }
        while(!stack.isEmpty()){
            str=stack.peek()+str;
            stack.pop();
        }
        return str;
    }
}