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
    private int count=0;
    public int goodNodes(TreeNode root) {
        
        return dfs(root,root.val);
    }

    private int dfs(TreeNode root,int valu){
        if(root==null){
            return 0;
        }

        int res = (root.val >= valu) ? 1 : 0;
        valu = Math.max(valu,root.val);
        res = res+dfs(root.left,valu);
        res = res+dfs(root.right,valu);

        return res;
    }
}
