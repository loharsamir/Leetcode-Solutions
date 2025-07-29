class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        while(true){
            int sum=0;
            while(n!=0){
                sum+=Math.pow(n%10,2.0);
                n/=10;
            }
            n=sum;
            if(n==1)return true;
            if(set.contains(n))return false;
            else set.add(n);

        }
    }
}