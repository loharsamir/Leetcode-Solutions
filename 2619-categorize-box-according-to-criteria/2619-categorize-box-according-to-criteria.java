class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        Boolean bulky=false,heavy=false;
        if(length>=10000|| width>=10000||height>=10000||((long)length*(long)width*(long)height)>=1000000000){
            bulky=true;
        }
        if(mass>=100)heavy=true;
        String ans="";
        if(bulky && heavy)ans="Both";
        else if(!bulky && !heavy)ans="Neither";
        else if(bulky && !heavy)ans="Bulky";
        else if(!bulky && heavy)ans="Heavy";
        return ans;

    }
}