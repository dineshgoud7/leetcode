class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            boolean flag=false;
            int sum=candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++){
                if(i==j){
                    continue;
                }
                if(candies[j]>sum){
                    flag=true;
                }
            }
            if(!flag){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}