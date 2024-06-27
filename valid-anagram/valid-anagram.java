class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        char array1[] = s.toCharArray();
        Arrays.sort(array1);
        char array2[] = t.toCharArray();
        Arrays.sort(array2);
        
        boolean anagram = true;
        for(int i=0; i<s.length();i++){
            
            if(array1[i] != array2[i]){
                anagram = false ;
                return false;
            }
        }
       
        return true;
    }
}