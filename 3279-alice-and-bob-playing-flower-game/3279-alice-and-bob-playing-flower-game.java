class Solution {
    public long flowerGame(int n, int m) {
        long oddN=0;
        long evenN=0;
        if(n%2==0){
            oddN=n/2;
            evenN=n/2;
        }else{
            oddN=n/2+1;
            evenN=n/2;
        }
        int oddM=0;
        int evenM=0;
        if(m%2==0){
            oddM=m/2;
            evenM=m/2;
        }else{
            oddM=m/2+1;
            evenM=m/2;
        }
        return oddN*evenM+evenN*oddM;
    }
}