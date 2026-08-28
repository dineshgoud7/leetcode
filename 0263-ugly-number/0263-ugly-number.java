class Solution {
    public boolean prime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean isUgly(int n) {
         if(n<=0) return false;
        // for(int i=7;i<=n;i++){
        //     if(prime(i)){
        //         if(n%i==0){
        //             return false;
        //         }
        //     }
        // }
        // return true;
        while(n%2==0) n/=2;
        while(n%3==0) n/=3;
        while(n%5==0) n/=5;
        return n==1;

    }
}