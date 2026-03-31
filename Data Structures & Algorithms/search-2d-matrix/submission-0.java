class Solution {
     public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bottom = rows - 1;
        int row;
        while (top <= bottom) {
            row = (bottom + top) /2;
            if(target > matrix[row][matrix[top].length - 1]) {
                top = row + 1;
            }
            else if(target < matrix[row][0]) {
                bottom = row - 1;
            }else{
                break;
            }
        }
        if (!(top <= bottom)) {
            return false;
        }
        row = (top + bottom) / 2;
        int l = 0, r = cols - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (target > matrix[row][m]) {
                l = m + 1;
            } else if (target < matrix[row][m]) {
                r = m - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
