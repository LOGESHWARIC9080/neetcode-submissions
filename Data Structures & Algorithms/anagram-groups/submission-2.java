class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0){
            return null;
        }
        int nos[]={2,3,5,7,11,13,17,19,23,29,31,33,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        Map<Integer,List<String>> map= new HashMap<>();
        for(String str:strs){
            int prod=1;
            for(int i=0;i<str.length();i++){
                prod*=nos[str.charAt(i)-'a'];
            }
            if(map.containsKey(prod)){
                map.get(prod).add(str);
            }
            else{
                map.put(prod,new ArrayList<String>());
                map.get(prod).add(str);
            }
        }
        List<List<String>> result=new ArrayList<List<String>>();
        for(List<String>val:map.values()){
            result.add(val);
        }
        return result;
    }
}
