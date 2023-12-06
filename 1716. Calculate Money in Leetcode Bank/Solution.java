class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int week = 0;
        int day = 1;

        for (int i = 1; i <= n; i++) {
            total += week + day;
            day++;

            if (day > 7) {
                week++;
                day = 1;
            }
        }

        return total;
    }
}
