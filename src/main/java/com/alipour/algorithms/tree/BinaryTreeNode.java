package com.alipour.algorithms.tree;

import lombok.Getter;

@Getter
public class BinaryTreeNode extends TreeNode {
    private BinaryTreeNode leftNode;
    private BinaryTreeNode rightNode;

    public BinaryTreeNode(Integer data) {
        super(data);
    }

    public BinaryTreeNode() {
        super();
    }

    @Override
    public void insert(Integer data) {
        if (getData().equals(data)) {
            return;
        }
        if (getData().compareTo(data) < 0) {
            if (rightNode == null) {
                rightNode = new BinaryTreeNode(data);
            } else {
                rightNode.insert(data);
            }
        }
        if (getData().compareTo(data) > 0) {
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
        } else if (getData().compareTo(data) < 0) {
            return rightNode.get(data);
        } else {
            return leftNode.get(data);
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

    @Override
    public void innerOrder() {
        if (leftNode != null) {
            leftNode.innerOrder();
        }
        System.out.print(getData() + ", ");
        if (rightNode != null) {
            rightNode.innerOrder();
        }
    }

    @Override
    public void preOrder() {
        System.out.print(getData() + ", ");
        if (leftNode != null) {
            leftNode.preOrder();
        }
        if (rightNode != null) {
            rightNode.preOrder();
        }
    }

    @Override
    public void postOrder() {
        if (leftNode != null) {
            leftNode.postOrder();
        }
        if (rightNode != null) {
            rightNode.postOrder();
        }
        System.out.print(getData() + ", ");
    }


    @Override
    public void levelOrder() {
        // TODO: 7/16/2020 Implement in next session
    }
}
