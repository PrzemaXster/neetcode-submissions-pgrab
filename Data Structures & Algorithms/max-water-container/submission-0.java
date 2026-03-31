class Solution {
   public static int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = 0;
        while (l < r) {
            int distance = r-l;
            max = Math.max(max, Math.min(heights[l], heights[r]) * distance);
            if(heights[l] < heights[r]) {
                l++;
            }else if(heights[l] >= heights[r]) {
                r--;
            }
        }
        return max;
    }
}
