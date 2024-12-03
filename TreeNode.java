package leetCode;

import com.sun.source.tree.Tree;

public class TreeNode {
     int val;
     TreeNode root;
     TreeNode left;
     TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

     public static void main(String[] args){
         TreeNode treeNode = new TreeNode();
         treeNode.root.val = 10;
         treeNode.left.val = 5;
         treeNode.right.val = 15;
         treeNode.left.left.val = 3;

     }
}

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        System.out.println(root.val + " " + low + " " +high);
        System.out.println(root.val + " " + low + " " +high);
        return 0;
        //test1
    }
}