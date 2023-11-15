class Solution {
    public double[] convertTemperature(double c) {
        double k = c + 273.15;
        double f = 1.8*c + 32;
        double[] ans = {k,f};
        return ans;
    }
}
