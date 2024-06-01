//260. Single Number III

class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> array =new ArrayList<Integer>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if((i == 0 || nums[i] != nums[i - 1]) && (i == n - 1 || nums[i] != nums[i + 1])){
                array.add(nums[i]);
            }
        } 
       int[] result = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            result[i] = array.get(i);
        }
        return result;
    }
}