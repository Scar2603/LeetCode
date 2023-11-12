class Solution {
    public int countDigits(int num) {
        int temp = num;
        int count = 0;
        while(temp > 0){
            int val = temp % 10;
            if(val != 0 && num % val == 0)   
                count++;
            temp /= 10;
        }
        return count;
    }
}
