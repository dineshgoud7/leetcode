class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int x=num+t;
        while(t>0){
            x+=1;
            t--;
        }
        return x;
        
    }
}