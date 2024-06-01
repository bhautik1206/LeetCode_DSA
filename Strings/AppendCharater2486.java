//2486. Append Characters to String to Make Subsequence

class Solution {
    public int appendCharacters(String s, String t) {
        int n=s.length();
        int m=t.length();
        int count=0,j=0,i=0;
        while(i<n && j<m){
            if(s.charAt(i) != t.charAt(j)) i++;
            else{
                i++;
                j++;
                count++;
            }
        }
    return m-count;
    }
}