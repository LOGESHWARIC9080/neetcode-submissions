class Solution {
    public boolean isAnagram(String s, String t) {
        int [] arr= new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
           arr[ch-'a']++;
           arr[ch1-'a']--;
        }
        for(int n : arr){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}
