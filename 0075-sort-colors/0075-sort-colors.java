class Solution {
    public void sortColors(int[] arr) {

        // int count0=0;
        // int count1=0;
        // int count2=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0) count0++;
        //      if(arr[i]==1) count1++;
        //       if(arr[i]==2) count2++;
        // }
        //  for(int i=0;i<count0;i++){
        //     arr[i]=0;
        //  }
        //  for(int i=count0;i<count1+count0;i++){
        //     arr[i]=1;
        //  }
        //  for(int i=count1+count0;i<arr.length;i++){
        //     arr[i]=2;
        //  }


       //Douch National Algo
       int mid=0,low=0,high=arr.length-1;
       while(mid<=high){
        if(arr[mid]==0){
            int temp=arr[mid];
            arr[mid]=arr[low];
            arr[low]=temp;
            low++;mid++;
        }
         else if(arr[mid]==1){
            mid++;
        }
        else{
            int temp=arr[mid];
            arr[mid]=arr[high];
            arr[high]=temp;
            high--;
        }
       }
            


    }
}