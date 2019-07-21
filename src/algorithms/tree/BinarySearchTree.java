package algorithms.tree;

import algorithms.tree.BinaryTree.TreeNode;

import java.util.Scanner;

import static algorithms.tree.TreeTraversal.postOrder;
import static algorithms.tree.TreeTraversal.preorder;

public class BinarySearchTree {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter root data");
        int rootData = sc.nextInt();
        TreeNode root = new TreeNode(rootData);

        while (true) {
            System.out.println("Enter data, -1 for no data");
            int data = sc.nextInt();
            if (data == -1) {
                break;
            }
            createNode(root, data);
        }

        System.out.println("PreOrder : ");
        preorder(root);

        System.out.println();
        System.out.print("PostOrder : ");
        postOrder(root);

        System.out.println();
        System.out.print("InOrder : ");
        TreeTraversal.inOrder(root);

        System.out.println();
        System.out.println("Level Order : ");
        TreeTraversal.levelOrder(root);

    }

    private static void createNode(TreeNode node, int data) {
        TreeNode newNode = new TreeNode(data);
        if (data < node.data) {
            if (node.left == null) {
                node.left = newNode;
            } else {
                createNode(node.left, data);
            }
        } else {
            if (node.right == null) {
                node.right = newNode;
            } else {
                createNode(node.right, data);
            }
        }
    }
}
