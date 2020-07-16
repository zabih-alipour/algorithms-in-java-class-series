package com.alipour.algorithms.tree;

import java.lang.reflect.ParameterizedType;

public class Tree<T extends TreeNode> implements Actions, Order {
    T root;
    Class<T> type;

    public Tree(Class<T> tClass) {
        type = tClass;
    }

    private boolean hasRoot() {
        return root != null;
    }

    private T getInstance(Integer data) {
        try {
            T t = type.newInstance();
            t.setData(data);
            return t;
        } catch (Exception e) {
            // Oops, no default constructor
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insert(Integer data) {

        if (hasRoot()) {
            root.insert(data);
        } else root = getInstance(data);
    }

    @Override
    public void innerOrder() {
        if (hasRoot()) {
            root.innerOrder();
        }
    }

    @Override
    public void preOrder() {
        if (hasRoot()) {
            root.preOrder();
        }
    }

    @Override
    public void postOrder() {
        if (hasRoot()) {
            root.postOrder();
        }
    }

    @Override
    public TreeNode max() {
        if (hasRoot()) {
            return root.max();
        }
        return null;
    }

    @Override
    public TreeNode min() {
        if (hasRoot()) {
            return root.min();
        }
        return null;
    }
}
