  class Solution {  
    public int strStr(String haystack, String needle) {

        int i = 0;
        int j = 0;
        int result = 0;

        while(i < haystack.length() && j < needle.length()){
            if (needle.charAt(j) == haystack.charAt(i)){
                i++;
                j++;
            }else{
                i= result+1;
                j=0;
                result = i;
            }
        }

        if(j == needle.length()){
            return result;   
        }else return -1;
            
    }
       
           
}