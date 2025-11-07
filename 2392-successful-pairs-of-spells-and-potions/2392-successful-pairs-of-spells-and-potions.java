class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int ans[]=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int count=0;
            int left=0,right=potions.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                long val=(long)spells[i]*(long)potions[mid];
                if(val>=success){
                    count=potions.length-mid;
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}