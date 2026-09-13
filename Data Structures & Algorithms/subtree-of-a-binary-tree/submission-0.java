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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(subRoot==null){
            return true;
        }

        if(isSame(root,subRoot)){
            return true;
        }

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

    }

    public static boolean isSame(TreeNode root,TreeNode subroot){
        if(root==null && subroot==null){
            return true;
        }

        if(root!=null && subroot!=null && root.val==subroot.val){
            return isSame(root.left,subroot.left) && isSame(root.right,subroot.right);
        }

        return false;
    }
}
