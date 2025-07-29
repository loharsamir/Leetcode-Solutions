class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleCount=0;
        int doubleCount=0;
        for(int i:nums){
            if(i<10)singleCount+=i;
            else doubleCount+=i;
        }
        return singleCount!=doubleCount;
    }
}