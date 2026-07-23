class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        String str="{([";
        for(char ch:s.toCharArray()){
            if(str.contains(ch+"")){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                if((ch==')' && stack.peek() == '(') ||
                (ch==']' && stack.peek()=='[') ||
                (ch=='}' && stack.peek()=='{')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}