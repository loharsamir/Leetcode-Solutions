class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        int m=g.length;
        int n=s.length;
        while( j<n && i<m ){
            if(g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return i;

    }
}