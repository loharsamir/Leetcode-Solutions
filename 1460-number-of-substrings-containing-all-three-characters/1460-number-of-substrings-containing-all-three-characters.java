class Solution {
    public int numberOfSubstrings(String s) {
        // int count=0;
        // for(int i=0;i<s.length();i++){
        //      int arr[]={0,0,0};

        //     for(int j=i;j<s.length();j++){
        //         arr[s.charAt(j)-'a']=1;
        //         if(arr[0]+arr[1]+arr[2]==3){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        // int countA=0,countB=0,countC=0;
        // int l=0;
        // int count=0;
        // int ans=0;
        // for(int r=0;r<s.length();r++){
        //     if(s.charAt(r)=='a')countA++;
        //     if(s.charAt(r)=='b')countB++;
        //     if(s.charAt(r)=='c')countC++;
        //     if(countA>=1 && countB>=1 && countC>=1){
        //         count++;
        //     }
        //     while(count>=1){
        //         ans+=s.length()-r;
        //     if(s.charAt(l)=='a')countA--;
        //     if(s.charAt(l)=='b')countB--;
        //     if(s.charAt(l)=='c')countC--;
        //     if(countA==0 || countB==0 || countC==0){
        //         count--;
        //     }
        //     l++;
        //     }
        // }
        // return ans;

        int l=0;
        int count=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>=3){
                count+=s.length()-r;
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0)map.remove(s.charAt(l));
                l++;
            }
        }
        return count;

    }
}