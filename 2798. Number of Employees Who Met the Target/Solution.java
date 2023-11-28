class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        int n = hours.length;
        int result=0;
        for(int i=0;i<n;i++){
            if(hours[i]>=target){
                result = nw-i;
                return result;
            }
        }
        return result;
    }
}
