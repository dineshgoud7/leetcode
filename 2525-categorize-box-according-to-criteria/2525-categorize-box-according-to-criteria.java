class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int maxdimen=10000;
        int maxvol=1000000000;
        long vol=(long)length*width*height;
        if((length>=maxdimen || width>=maxdimen ||
            height>=maxdimen || mass>=maxdimen || vol>=maxvol) && mass>=100 ){
                return "Both";
        }else if((length>=maxdimen || width>=maxdimen ||
            height>=maxdimen || mass>=maxdimen || vol>=maxvol) && mass<100){
                return "Bulky";
        }
        
        else if(mass>=100){
            return "Heavy";
        }else{
            return "Neither";
        }
    }
}