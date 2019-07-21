package algorithms.tree;

import algorithms.tree.BinaryTree.TreeNode;

import java.util.LinkedList;

class TreeTraversal {

    static void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    static void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    static void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    static void levelOrder(TreeNode node) {
        LinkedList<TreeNode> uQ = new LinkedList<>();
        uQ.offer(node);
        level(uQ);
    }

    private static void level(LinkedList<TreeNode> uQ) {
        LinkedList<TreeNode> lQ = new LinkedList<>();

        uQ.forEach(tNode -> {
            if (tNode.left != null) {
                lQ.add(tNode.left);
            }
            if (tNode.right != null) {
                lQ.add(tNode.right);
            }
        });

        printLevel(uQ);
        if (lQ.size() > 0) {
            level(lQ);
        }
    }

    private static void printLevel(LinkedList<TreeNode> uQ) {
        uQ.forEach(node -> System.out.print(node.data + " "));
        System.out.println();
    }

    private static int maxHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int lH = maxHeight(node.left);
        int rH = maxHeight(node.right);
        return 1 + Math.max(lH, rH); //1 for height of root node
    }

}
