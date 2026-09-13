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
    public boolean isValidBST(TreeNode root) {
        boolean flag=true;
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root,res);

        for(int i=1;i<res.size();i++){
            if(res.get(i-1) >= res.get(i)){
                flag = false;
                break;
            }
        }

        return flag;
        
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
