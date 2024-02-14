class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        int[] result = new int[nums.length];
        int i = 0;

        while (!positive.isEmpty() || !negative.isEmpty()) {
            if (!positive.isEmpty()) {
                result[i++] = positive.remove(0);
            }
            if (!negative.isEmpty()) {
                result[i++] = negative.remove(0);
            }
        }

        return result;
    }
}
