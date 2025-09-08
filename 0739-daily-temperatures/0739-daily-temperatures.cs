public class Solution {
    public int[] DailyTemperatures(int[] temperatures) {
        // int n=temperatures.Length;
        // int[] ans=new int[n];
        // for(int i=0;i<n;i++){
        //     bool find=false;
        //     for(int j=i+1;j<n;j++){
        //         if(temperatures[j]>temperatures[i]){
        //             find=true;
        //             ans[i]=j-i;
        //             break;
        //         }
        //     }
        //     if(!find)ans[i]=0;
        // }
        // return ans;
        int n=temperatures.Length;
        int[] ans=new int[n];
        Stack<int>st=new Stack<int>();
        for(int i=n-1;i>=0;i--){
            while(st.Count!=0 && temperatures[st.Peek()]<=temperatures[i]){
                st.Pop();
            }
            if(st.Count>0){
                ans[i]=st.Peek()-i;
            }else{
                ans[i]=0;
            }
            st.Push(i);
        }
        return ans;

    }
}