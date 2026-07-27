class Solution {
    public static boolean isvowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] arr=s.toCharArray();
        while(left<right){
            while(left<right && !isvowel(arr[left])){
                left++;
            }
            while(left<right && !isvowel(arr[right])){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}