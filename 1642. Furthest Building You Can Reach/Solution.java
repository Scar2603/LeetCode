class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        PriorityQueue<Integer> heightDifferences = new PriorityQueue<>();

        for (int i = 1; i < n; i++) {
            if (heights[i] > heights[i - 1]) {
                int diff = heights[i] - heights[i - 1];
                if (diff <= 0) {
                    continue;
                } else {
                    heightDifferences.add(diff);
                    if (heightDifferences.size() > ladders) {
                        bricks -= heightDifferences.remove();
                    }
                    if (bricks < 0) {
                        return i - 1;
                    }
                }
            }
        }
        return n - 1;
    }
}
