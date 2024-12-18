package leetCode;

import com.sun.source.tree.Tree;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _111 {
/*
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 2

Example 2:
Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
* */
    public static void main(String args[]) {
        String[] root = {"3","9","20",null,null,"15","7"};
        TreeNode treeNode = new TreeNode(root);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(String[] root) {
            List<String> rootArr = new ArrayList<>(Arrays.asList(root));
            System.out.println(rootArr);
        }
    }

    public int minDepth(TreeNode root) {
        int result = 0;
        return result;
    }
}
