class Solution {
    public int findClosest(int x, int y, int z) {
        int min1=Math.abs(z-x);
        int min2=Math.abs(z-y);
        if(min1>min2){
            return 2;
        }
        if(min1<min2){
            return 1;
        }
        return 0;
    }
}