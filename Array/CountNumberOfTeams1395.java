//1395. Count Number of Teams

class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(rating[i]<rating[j] && rating[j]<rating[k]){
                        count++;
                    }else if(rating[i]>rating[j] && rating[j]>rating[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}