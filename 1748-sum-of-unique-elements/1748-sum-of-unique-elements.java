class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int arr[]=new int[101];
        for(int i: nums){
            arr[i]++;
        }
        for(int i=0;i<101;i++){
            if(arr[i]==1)sum+=i;
        }
        return sum;
    }
}