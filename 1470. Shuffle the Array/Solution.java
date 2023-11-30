class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i = 0;
        for(int j = 0; j < n; j++){
            result[i] = nums[j];
            result[i+1] = nums[j+n];
            i+=2;
        }
        return result;
    }
}
