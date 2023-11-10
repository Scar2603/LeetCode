class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;
        for(int i : aliceSizes){
            aliceTotal += i;
        }
        for(int i : bobSizes){
            bobTotal += i;
        }
        for(int i = 0;i<aliceSizes.length;i++){
            for(int j = 0;j<bobSizes.length;j++){
                int aliceExchange = aliceTotal - aliceSizes[i] + bobSizes[j];
                int bobExchange = bobTotal - bobSizes[j] + aliceSizes[i];
                if(aliceExchange == bobExchange){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[0];
    }
}
