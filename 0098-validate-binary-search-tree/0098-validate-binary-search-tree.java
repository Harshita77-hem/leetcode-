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
    private void inorder(TreeNode r,ArrayList<Integer>arr){
        if(r==null) return;
        inorder(r.left,arr);
        arr.add(r.val);
        inorder(r.right,arr);
        
    }
        
        

    
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1)>=arr.get(i)) return false;
        }
        return true;

        
        

        
        
    }
}