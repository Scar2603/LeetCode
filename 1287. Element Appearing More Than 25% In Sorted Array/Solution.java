class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int percent = n / 4;

        for (int i = 0; i < n - percent; i++) {
            if (arr[i] == arr[i + percent]) {
                return arr[i];
            }
        }

        return -1;
    }
}

