class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int leftsum = 0,rightsum = 0;
        int totalsum = 0;
        for (int num : nums) {
            totalsum += num;
        }
        for(int i=0;i<n;i++){
            rightsum = totalsum - leftsum - nums[i];
            result[i] =( i*nums[i] - leftsum) + (rightsum-((n-1)-i)*nums[i]);
            leftsum += nums[i];
        }
        return result;
    }
}
