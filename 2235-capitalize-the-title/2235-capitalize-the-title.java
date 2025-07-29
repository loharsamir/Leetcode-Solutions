class Solution {
    public String capitalizeTitle(String title) {
        String str=title.toLowerCase();
        StringBuilder sb=new StringBuilder();
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>2){
                sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}