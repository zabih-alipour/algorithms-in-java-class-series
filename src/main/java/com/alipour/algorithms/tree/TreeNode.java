package com.alipour.algorithms.tree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreeNode implements Order, Actions {
    private Integer data;

    public TreeNode(Integer data) {
        this.data = data;
    }

    public TreeNode() {
    }

}
