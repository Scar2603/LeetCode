class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxElement = Integer.MIN_VALUE;
        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
        }

        int[] frequencyArray = new int[maxElement + 1];
        for (int num : nums) {
            frequencyArray[num]++;
        }

        int maxFrequency = 0;
        for (int frequency : frequencyArray) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }
        
        int count = 0;
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] == maxFrequency) {
                count += maxFrequency;
            }
        }

        return count;
    }
}