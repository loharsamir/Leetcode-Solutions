class Solution {
    public int[] asteroidCollision(int[] nums) {
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            boolean collide=false;
            while(st.size()>0 && st.peek()>0 && nums[i]<0){
                if(st.peek()< -nums[i]){
                    st.pop();
                }else if(st.peek()== -nums[i]){
                    collide=true;
                    st.pop();
                    break;
                }else {
                    collide=true;
                    break;
                }
            }
            if(!collide){
                st.push(nums[i]);
            }
        }
        int[] ans=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}