class Solution {
    boolean isPalindrome(String s) {
        // code here
        int f=0;
        int l=s.length()-1;
        while(f<=l){
            if(s.charAt(f)==s.charAt(l)){
                f++;
                l--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}