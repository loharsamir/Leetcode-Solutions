class Solution {
    public int subarraySum(int[] arr, int k) {
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++){
        //         sum+=arr[j];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        int pref[]=new int[arr.length];
        pref[0]=arr[0];    
        for(int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            int ans=pref[i]-k;
            if(pref[i]==k)count++;
            if(map.containsKey(ans)){
                //map.put(pref[i],map.get(pref[i])+1);
                count+=map.get(ans);
                
            }
            map.put(pref[i],map.getOrDefault(pref[i],0)+1);
        }
        return count;
    }
}