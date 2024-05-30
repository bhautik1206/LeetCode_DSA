// Valid Anagram 242
class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2){
            return false;
        }
        int []counts=new int[26];
        for(int i=0;i<n1;i++){
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }
        for(int i:counts){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}