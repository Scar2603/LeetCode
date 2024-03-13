class Solution {
    public int pivotInteger(int n) {
        int temp = 0;
        for (int i=n;i>0;i--){
        int sum = (i*(i+1))/2 ;
        temp+=i;
        if (sum==temp) 
            return i ;
       } 
       return -1;
    }
}
