class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        int max=0;
        for(int num:nums){
            set.add(num);
        }
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(set.contains(num-1)){
                continue;
            }
        
            int currlength=0;
            while(set.contains(num)){
                currlength++;
                num+=1;
            }
            max=Math.max(max,currlength);
        }
        
        return max;
    }
}
