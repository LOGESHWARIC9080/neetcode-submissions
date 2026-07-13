class Solution {

    public String encode(List<String> strs) {
        StringBuilder st= new StringBuilder();
        for(String str:strs){
            st=st.append(str.length()).append("#").append(str);
        }
        return st.toString();
    }

    public List<String> decode(String str) { 
        List<String> res= new ArrayList<String>();
        int i=0;
        while(i<str.length()){
            int j=i+1;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=len+i;
            res.add(str.substring(i,j));
            i=j;
        }
        return res;
    }
}
