class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int len=3;
        while(len<=arr.length){
            for(int i=0;i<arr.length;i++){
                int temp=0;
                if(len+i<=arr.length){
                    for(int j=i;j<i+len;j++){
                        temp+=arr[j];
                    }
                }
                sum+=temp;
            }
            len+=2;
        }
        return sum;
    }
}