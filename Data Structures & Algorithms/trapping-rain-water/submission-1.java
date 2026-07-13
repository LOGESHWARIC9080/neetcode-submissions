class Solution {
    public int trap(int[] height) {
        int len = height.length;
        if (len == 0) return 0;

        int[] leftMax = new int[len];
        int[] rightMax = new int[len];
        int water = 0;

        
        leftMax[0] = height[0];
        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        
        rightMax[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

       
        for (int i = 0; i < len; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            water += minHeight - height[i];
        }

        return water;
    }
}
