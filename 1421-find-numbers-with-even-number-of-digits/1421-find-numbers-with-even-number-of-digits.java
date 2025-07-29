class Solution {
    public int findNumbers(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     String digit=nums[i]+"";
            
        //     if(digit.length()%2==0)count++;
        // }
        // return count;
        int count=0;
        for(int i:nums){
            if((i>9 && i<100) || (i>999 && i<10000) || i==100000)count++;
        }
        return count;
    }
}