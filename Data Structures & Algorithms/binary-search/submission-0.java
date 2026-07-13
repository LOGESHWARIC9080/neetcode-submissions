class Solution {
    public int search(int[] nums, int target) {
        int res=0;
        int left=0;
        int len= nums.length;
        int right=len-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
                
            }
            if(nums[mid]<target){
                left=mid+1;
            }
            if(nums[mid]>target){
                right=mid-1;
            }
            
        }

        return -1;
    }
}
