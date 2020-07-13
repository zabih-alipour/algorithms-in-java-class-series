package com.alipour.algorithms.tree;

public interface Actions {
    default void insert(Integer data) {
        throw new UnsupportedOperationException();
    }

    default TreeNode delete(Integer data) {
        throw new UnsupportedOperationException();
    }

    default TreeNode get(Integer data) {
        throw new UnsupportedOperationException();
    }

    default TreeNode min() {
        throw new UnsupportedOperationException();
    }

    default TreeNode max() {
        throw new UnsupportedOperationException();
    }
}
