class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int l1=s1.length();
        int l2=s2.length();
        int l3=s3.length();
        int min=Math.min(l1,Math.min(l2,l3));
        int i=0;
        int count=0;
        if(s1.equals(s2) && s2.equals(s3))return 0;
        while(i<min){
            if(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)){
                count++;
            }else{
                if(count==0)return -1;
                break;
                
            }
            i++;
        }
        return (l1-count)+(l2-count)+(l3-count);
    }
}