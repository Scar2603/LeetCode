class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        
        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        
        Arrays.sort(index, (a, b) -> score[b] - score[a]);
        
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            int id = index[i];
            if (i == 0) {
                result[id] = "Gold Medal";
            } else if (i == 1) {
                result[id] = "Silver Medal";
            } else if (i == 2) {
                result[id] = "Bronze Medal";
            } else {
                result[id] = String.valueOf(i + 1);
            }
        }
        
        return result;
    }
}
