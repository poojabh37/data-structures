package algorithms;

import java.util.Scanner;

public class BinaryTree {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TreeNode root = createNode();
        createNode();
        preorder(root);
    }

    private static TreeNode createNode() {
        System.out.print("Enter data (-1 for no data) : ");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        TreeNode newNode = new TreeNode(data);

        System.out.println("Enter left child of " + newNode.data);
        newNode.left = createNode();

        System.out.println("Enter right child of " + newNode.data);
        newNode.right = createNode();

        return newNode;
    }

    private static void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    static class TreeNode {
        int data;
        TreeNode right;
        TreeNode left;

        TreeNode(int data) {
            this.data = data;
        }
    }
}
