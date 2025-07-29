class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            arr[indices[i]]=s.charAt(i);
        }
        //StringBuilder sb=new StringBuilder();
        //return sb.append(arr).toString();
        return new String(arr);
    }
}