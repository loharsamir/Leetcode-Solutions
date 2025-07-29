class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]+nums[1]<=nums[2])return "none";
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        if(set.size()==1)return "equilateral";
        else if(set.size()==2)return "isosceles";
        else return "scalene";
    }
}