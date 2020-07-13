package com.alipour.algorithms.tree;

import java.lang.reflect.ParameterizedType;

public class Tree<T extends TreeNode> implements Actions {
    T root;

    private boolean hasRoot() {
        return root != null;
    }

    public T getInstance(Integer data) {
        ParameterizedType superClass = (ParameterizedType) getClass().getGenericSuperclass();
        Class<T> type = (Class<T>) superClass.getActualTypeArguments()[0];
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
}
