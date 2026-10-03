class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int n=nums.length;
        int m=nums[0].length;
        int row=0;
        int col=m-1;
        while(row<n && col>=0){
            if(nums[row][col]==target){
                return true;
            }
            else if(nums[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}