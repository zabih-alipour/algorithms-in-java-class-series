package com.alipour.algorithms.tree;

public interface Order {
    default void preOrder() {
        System.out.println("preOrder not implemented yet!!!");
    }

    default void postOrder() {
        System.out.println("rightOrder not implemented yet!!!");

    }

    default void innerOrder() {
        System.out.println("innerOrder not implemented yet!!!");

    }

    default void levelOrder() {
        System.out.println("levelOrder not implemented yet!!!");

    }
}
