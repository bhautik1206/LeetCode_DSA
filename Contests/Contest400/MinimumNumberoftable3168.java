//Minimum Number of Chairs in a Waiting Room
class Solution {
    public int minimumChairs(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        int count=0,maxcount=0;
        for(int i=0;i<n;i++){
            if(ch[i]=='E'){
                count++;
            }
            else if(ch[i]=='L'){
                count--;
            }
            if(count>maxcount){
                maxcount=count;
            }
        }
        return maxcount;
    }
}