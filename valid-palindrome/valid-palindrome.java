class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.isEmpty() ){
            return true;
        }

        s = s.replaceAll("[^0-9a-zA-Z]", "");

        if(s.isEmpty()){
            return true;
        }
    
        s = s.toLowerCase();
        
        StringBuilder s1 = new  StringBuilder(s);
        s1.reverse();
       
        
                        
        return s.equals(s1.toString());
    }
}