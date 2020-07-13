package com.alipour.algorithms.tree;

import lombok.Getter;

@Getter
public class BinaryTreeNode extends TreeNode {
    private BinaryTreeNode leftNode;
    private BinaryTreeNode rightNode;

    public BinaryTreeNode(Integer data) {
        super(data);
    }

    public BinaryTreeNode(){
        super();
    }

    @Override
    public void insert(Integer data) {
        if (getData().equals(data)) {
            return;
        }
        if (getData().compareTo(data) > 0) {
            if (rightNode == null) {
                rightNode = new BinaryTreeNode(data);
            } else {
                rightNode.insert(data);
            }
        }
        if (getData().compareTo(data) < 0) {
            if (leftNode == null) {
                leftNode = new BinaryTreeNode(data);
            } else {
                leftNode.insert(data);
            }
        }
    }

    @Override
    public TreeNode get(Integer data) {
        if (getData().equals(data)) {
            return this;
        } else if (getData().compareTo(data) > 0) {
            return rightNode;
        } else {
            return leftNode;
        }
    }

    @Override
    public TreeNode min() {

        if (leftNode == null)
            return this;

        return leftNode.min();
    }

    @Override
    public TreeNode max() {
        if (rightNode == null)
            return this;

        return rightNode.max();
    }
}
