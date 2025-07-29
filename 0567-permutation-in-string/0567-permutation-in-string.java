class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false; 
        HashMap<Character,Integer>s1map=new HashMap<>();
        for(char ch:s1.toCharArray()){
            s1map.put(ch,s1map.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer>s2map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s2.charAt(i);
            if(s1.indexOf(s2.charAt(i))!=-1){
                s2map.put(ch,s2map.getOrDefault(ch,0)+1);
            }
        }
        if(s1map.equals(s2map)) return true;

        int l=0,r=s1.length();
        while(r<s2.length()){
            if(s1.indexOf(s2.charAt(r))!=-1){
                char ch=s2.charAt(r);
                s2map.put(ch,s2map.getOrDefault(ch,0)+1);
            }
            if(s1.indexOf(s2.charAt(l))!=-1){
                char bh=s2.charAt(l);
                s2map.put(bh,s2map.get(bh)-1);
            }
            r++;
            l++;
            if (s1map.equals(s2map)) return true;
        }
        return false;
    }
}