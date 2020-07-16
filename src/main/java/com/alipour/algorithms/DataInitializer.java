package com.alipour.algorithms;

import com.alipour.algorithms.tree.BinaryTreeNode;
import com.alipour.algorithms.tree.Tree;

import java.security.SecureRandom;
import java.util.Random;

public class DataInitializer {

    public static Tree<BinaryTreeNode> BinaryTreeInitializer() {
        Random random = new SecureRandom();
        Tree<BinaryTreeNode> tree = new Tree<>(BinaryTreeNode.class);
        for (int val =0; val<=15; val++){
            tree.insert(random.nextInt(200));
        }

        return tree;
    }
}
