//Sum of All Subset XOR Totals

class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int result=0;
        if(n==1){
            return nums[0];
        }
        if(n<0){
            return 0;
        }
         for (int mask = 0; mask < (1 << n); mask++) {
            int xor = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) > 0) {
                    xor ^= nums[i]; 
                }
            }
            result += xor; 
        }
        return result;
    }
}