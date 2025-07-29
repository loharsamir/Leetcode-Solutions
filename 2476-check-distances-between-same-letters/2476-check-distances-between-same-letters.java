class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int arr[]=new int[26];
        Arrays.fill(arr,-1);
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(arr[idx]==-1){
                arr[idx]=i;
            }else{
                int dist=i-arr[idx]-1;
                if(dist!=distance[idx]){
                    return false;
                }

            }
        }
        return true;
    }
}