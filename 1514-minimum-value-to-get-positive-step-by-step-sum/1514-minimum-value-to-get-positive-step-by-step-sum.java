class Solution {
    public int minStartValue(int[] nums) {
        int min=Integer.MAX_VALUE, temp = 0;
        for(var v : nums){
            temp += v;
            min=Math.min(min,temp);
        }
        if(min>0) return 1;
        return Math.abs(min) + 1;
        
    }
}