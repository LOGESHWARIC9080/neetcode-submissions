class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0){
            return res;
        }
        Arrays.sort(nums);
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Set<String> str=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if (map.containsKey(-1*sum)){
                    int k=map.get(-1*sum);
                    if(!str.contains(nums[i]+":"+nums[j]+":"+nums[k])&&k>i&&k>j){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        str.add(nums[i]+":"+nums[j]+":"+nums[k]);
                    }
                }
            }
            
        }
        return res;
    }
}
