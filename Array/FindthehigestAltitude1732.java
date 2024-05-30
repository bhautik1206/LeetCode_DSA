//find the highest altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        ArrayList<Integer> peak = new ArrayList<>();
        int currentAltitude=0;
        peak.add(currentAltitude);
        for(int i=0;i<n;i++){
            currentAltitude+=gain[i];
            peak.add(currentAltitude);
        }
        int maxnum = Collections.max(peak);
        return maxnum;
    }
}