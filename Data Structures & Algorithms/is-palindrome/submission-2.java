class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int r=0;
        int l=s.length()-1;
        while(r<l){
            if(s.charAt(r)!=s.charAt(l)){
                return false;
            }
            r++;
            l--;
        }
        return true;

        
    }
}
