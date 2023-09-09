package com.scy.avl;


import com.scy.bst.BinarySearchTrees;

public class AvlNode<T>{
    private T  Element;// 节点值域
    private BinarySearchTrees.BinaryTreeNode<T> right;
    private BinarySearchTrees.BinaryTreeNode<T> left;
    private  Integer height;

    public T getElement() {
        return Element;
    }

    public void setElement(T element) {
        Element = element;
    }

    public BinarySearchTrees.BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinarySearchTrees.BinaryTreeNode<T> right) {
        this.right = right;
    }

    public BinarySearchTrees.BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTrees.BinaryTreeNode<T> left) {
        this.left = left;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public AvlNode(T element, BinarySearchTrees.BinaryTreeNode<T> right, BinarySearchTrees.BinaryTreeNode<T> left) {
        Element = element;
        this.right = right;
        this.left = left;
        this.height=0;
    }
}
