//1442. Count Triplets That Can Form Two Arrays of Equal XOR

class Solution {
    public int countTriplets(int[] arr) {
        int xor, i, j, count = 0;
        int n=arr.length;
        for (i = 0; i < n; ++i) {
            xor = arr[i];
            for (j = i+1; j < n; ++j) {
                xor ^= arr[j];
                if (xor==0) count += j - i;
            }
        }
        return count;
    }
}
