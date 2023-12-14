class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;//Rowlength
        int n = grid[0].length;//Columnlength
        int[] onesRow = new int[m];
        int[] onesCol = new int[n];
        int[] zerosRow = new int[m];
        int[] zerosCol = new int[n];
        int[][] diff = new int[m][n]; 

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    zerosRow[i]++;
                    zerosCol[j]++;
                }
                if(grid[i][j]==1){
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                diff[i][j]=onesRow[i]+onesCol[j]-zerosRow[i]-zerosCol[j];
            }
        }
        return diff;
    }
}
