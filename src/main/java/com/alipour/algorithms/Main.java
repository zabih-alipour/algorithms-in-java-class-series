package com.alipour.algorithms;

import com.alipour.algorithms.tree.BinaryTreeNode;
import com.alipour.algorithms.tree.Tree;

public class Main {
    public static void main(String[] args) {
        Tree<BinaryTreeNode> tree = DataInitializer.BinaryTreeInitializer();

        tree.preOrder();
        System.out.println();
        tree.innerOrder();
        System.out.println();
        tree.postOrder();
        System.out.println();
        System.out.println("Min: " + tree.min());
        System.out.println("Max: " + tree.max());
    }
}
