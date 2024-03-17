package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BST_Transversal {
    int val;
    BST_Transversal left;
    BST_Transversal right;

    BST_Transversal() {}

    BST_Transversal(int val) {
        this.val = val;
    }

    BST_Transversal(int val, BST_Transversal left, BST_Transversal right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static class BinaryTreeTraversal {
        // Preorder traversal
        public List<Integer> preorderTraversal(BST_Transversal root) {
            List<Integer> result = new ArrayList<>();
            preorderHelper(root, result);
            return result   ;
        }

        //Preorder transversal Iterative
        public List<Integer> preorderTraversal_iterative(BST_Transversal root) {
            List<Integer> l = new ArrayList<>();
            if (root==null){return l;}

            Stack<BST_Transversal> S = new Stack<>();
            S.push(root);
            while(!S.isEmpty()){
                BST_Transversal topnode= S.peek();
                l.add(topnode.val);
                S.pop();
                if(topnode.right!=null){
                    S.push(topnode.right);
                }
                if(topnode.left!=null){
                    S.push(topnode.left);
                }
            }
            return l;
        }

        private void preorderHelper(BST_Transversal node, List<Integer> result) {
            if (node != null) {
                result.add(node.val);
                preorderHelper(node.left, result);
                preorderHelper(node.right, result);
            }
        }

        // Inorder traversal
        public List<Integer> inorderTraversal(BST_Transversal root) {
            List<Integer> result = new ArrayList<>();
            inorderHelper(root, result);
            return result;
        }

        private void inorderHelper(BST_Transversal node, List<Integer> result) {
            if (node != null) {
                inorderHelper(node.left, result);
                result.add(node.val);
                inorderHelper(node.right, result);
            }
        }

        // Postorder traversal
        public List<Integer> postorderTraversal(BST_Transversal root) {
            List<Integer> result = new ArrayList<>();
            postorderHelper(root, result);
            return result;
        }

        private void postorderHelper(BST_Transversal node, List<Integer> result) {
            if (node != null) {
                postorderHelper(node.left, result);
                postorderHelper(node.right, result);
                result.add(node.val);
            }
        }
    }

    public static class Main {
        public static void main(String[] args) {
            // Create a sample binary tree
            BST_Transversal root = new BST_Transversal(1);
            root.left = new BST_Transversal(2);
            root.right = new BST_Transversal(3);
            root.left.left = new BST_Transversal(4);
            root.left.right = new BST_Transversal(5);

            // Create an instance of the BinaryTreeTraversal class
            BinaryTreeTraversal traversal = new BinaryTreeTraversal();

            // Perform preorder traversal
            List<Integer> preorderResult = traversal.preorderTraversal_iterative(root);
            System.out.println("Preorder Traversal: " + preorderResult);

            // Perform inorder traversal
            List<Integer> inorderResult = traversal.inorderTraversal(root);
            System.out.println("Inorder Traversal: " + inorderResult);

            // Perform postorder traversal
            List<Integer> postorderResult = traversal.postorderTraversal(root);
            System.out.println("Postorder Traversal: " + postorderResult);
        }
    }
}

