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
    public int kthSmallest(TreeNode root, int k) {
        int ans = -1;
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root,res);

        for(int i=0;i<k;i++){
            ans = res.get(i);
        }

        return ans;
    }

    private static void inorder(TreeNode root,ArrayList<Integer> lst){
        if(root==null){
            return;
        }

        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right,lst);
    }
}
