//1653. Minimum Deletions to Make String Balanced

class Solution {
    public int minimumDeletions(String s) {
        int count=0;
        int deleteCount=0;
        for(char ch: s.toCharArray()){
            if(ch=='b'){
                count++;
            }else if (count>0){
                deleteCount++;
                count--;
            }
        }
        return deleteCount;
    }
}