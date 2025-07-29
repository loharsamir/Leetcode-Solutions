class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String>ans=new ArrayList<>();
        for(int i=0;i<s.length();i+=k){
            int end=Math.min(i+k,s.length());
            String group=s.substring(i,end);
            if(group.length()<k){
                int more=k-group.length();
                for(int j=0;j<more;j++){
                    group+=fill;
                }
            }
            ans.add(group);
        }
        return ans.toArray(new String[0]);        
    }
}