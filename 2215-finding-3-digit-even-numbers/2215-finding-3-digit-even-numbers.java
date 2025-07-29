class Solution {
    public int[] findEvenNumbers(int[] digits) {
        // HashSet<Integer>set=new HashSet<>();
        // for(int i=0;i<digits.length;i++){
        //     for(int j=0;j<digits.length;j++){
        //         for(int k=0;k<digits.length;k++){
        //             if(i==j || j==k || i==k)continue;
        //             else{
        //                 int num=digits[i]*100+digits[j]*10+digits[k];
        //                 if(num%2==0 && num>99){
        //                     set.add(num);
        //                 }

        //             }
        //         }
        //     }
        // }
        // int[] ans=new int[set.size()];
        // int index=0;
        // for(int i:set){
        //     ans[index++]=i;
        // }
        // Arrays.sort(ans);
        // return ans;

        
        ArrayList<Integer>list=new ArrayList<>();
        int[] count=new int[10];
        for(int i: digits){
            count[i]++;
        }
        for(int i=100;i<1000;i+=2){
            int h=i/100;
            int t=(i%100)/10;
            int o=i%10;
            count[h]--;count[t]--;count[o]--;
            if(count[h]>=0 && count[t]>=0 && count[o]>=0){
                list.add(i);
            }
            count[h]++;count[t]++;count[o]++;
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        
         return ans;
    }
}