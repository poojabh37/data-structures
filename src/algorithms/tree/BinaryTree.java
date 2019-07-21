package algorithms.tree;

import java.util.Scanner;

import static algorithms.tree.TreeTraversal.postOrder;
import static algorithms.tree.TreeTraversal.preorder;

public class BinaryTree {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TreeNode root = createNode();
        createNode();
        System.out.println("PreOrder : ");
        preorder(root);
        System.out.println("Post Order : ");
        postOrder(root);
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

    static class TreeNode {
        int data;
        TreeNode right;
        TreeNode left;

        TreeNode(int data) {
            this.data = data;
        }
    }
}
