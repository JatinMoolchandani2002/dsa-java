package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBST {
    int val;
    LevelOrderBST left;
    LevelOrderBST right;

    LevelOrderBST() {}

    LevelOrderBST(int val) {
        this.val = val;
    }

    LevelOrderBST(int val, LevelOrderBST left, LevelOrderBST right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static class Solution {
        public List<List<Integer>> levelOrder(LevelOrderBST root) {
            Queue<LevelOrderBST> queue = new LinkedList<>();
            List<List<Integer>> wraplist = new LinkedList<>();

            if (root == null) return wraplist;

            queue.offer(root);
            while (!queue.isEmpty()) {
                int levelNum = queue.size();
                List<Integer> sublist = new LinkedList<>();

                for (int i = 0; i < levelNum; i++) {
                    if (queue.peek().left != null) queue.offer(queue.peek().left);
                    if (queue.peek().right != null) queue.offer(queue.peek().right);
                    sublist.add(queue.poll().val);
                }

                wraplist.add(sublist);
            }

            return wraplist;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            // Create a sample binary tree
            LevelOrderBST root = new LevelOrderBST(3);
            root.left = new LevelOrderBST(9);
            root.right = new LevelOrderBST(20);
            root.right.left = new LevelOrderBST(15);
            root.right.right = new LevelOrderBST(7);

            // Create an instance of the Solution class
            Solution solution = new Solution();

            // Call the levelOrder method with the root of the binary tree
            List<List<Integer>> result = solution.levelOrder(root);

            // Print the result
            System.out.println("Level Order Traversal: " + result);
        }
    }
}
