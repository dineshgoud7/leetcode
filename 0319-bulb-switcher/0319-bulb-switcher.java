class Solution {
    public int bulbSwitch(int n) {
        if(n==1) return 1;
        /*int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        int round=2;
        int count=0;
        for(int i=2;i<=n;i++){
            for(int j=0;j<n;j++){
                if((j+1)%round==0){
                    if(arr[j]==1){
                        arr[j]=0;
                    }else{
                        arr[j]=1;
                    }
                }
            }
            round++;
        }
        for(int num:arr){
            if(num!=0){
                count++;
            }
        }
        return count;*/
        return (int)Math.sqrt(n);
    }
}