/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static TreeNode sorted(int[] nums,int low,int high){
        if(low>high){
            return null;
        }
        int mid=(low+high)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=sorted(nums,low,mid-1);
        root.right=sorted(nums,mid+1,high);
        return root;
        
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return sorted(nums,0,nums.length-1);
        
    }
}