class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int[] left=new int[n];
        int[] right=new int[n];
        
        for(int i=0;i<n;i++){
            left[i]=Integer.MAX_VALUE/2;
            right[i]=Integer.MAX_VALUE/2;
        }
        int val=Integer.MAX_VALUE/2;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                val=0;
                left[i]=val;
            }else{
                val++;
                left[i]=val;
            }
            
        }
          val=Integer.MAX_VALUE/2;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                val=0;
                right[i]=val;
            }else{
                val++;
                right[i]=val;
            }
            
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.min(left[i],right[i]);
        }
        return ans;


    }
}