class Solution {
    public static int findGCD(int a,int b){
        if(b==0) return a;
        return findGCD(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int count=0;
        int evensum=0,oddsum=0;
        int i=0;
        while(count<=n*2){
            if(i%2==0){
                evensum+=i;
                count++;
            }else{
                oddsum+=i;
                count++;
            }
            i++;
        }
        return findGCD(evensum,oddsum);
    }
}