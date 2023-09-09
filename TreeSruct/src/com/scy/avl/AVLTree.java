package com.scy.avl;

import com.scy.bst.BinaryTrees;

import java.util.List;

public class AVLTree <T extends  Comparable<? super T>>implements BinaryTrees {
    private   AvlNode<T> root;

    /**
     *  树的判空
     * **/
    @Override
    public boolean isEmpty() {
        return root==null;
    }
/**
 * 输入的操作和二叉搜索树一样
 * 但是插入之后要是维持一个平衡
 * */
    @Override
    public void insert(Object a) {

    }

    @Override
    public void remove(Object a) {

    }

    @Override
    public Object findMax() {
        return null;
    }

    @Override
    public Object findMin() {
        return null;
    }

    @Override
    public List preOrder() {
        return null;
    }

    @Override
    public List inOrder() {
        return null;
    }

    @Override
    public List postOrder() {
        return null;
    }

    @Override
    public void print() {

    }
}
