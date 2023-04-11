package com.scy.pojo;

import java.util.List;

/**
 * 搜索二叉树
 * **/
public class BinarySearchTrees<T extends Comparable<? super T>>implements BinaryTrees<T> {
       public  BinaryTreeNode<T> root;//二叉树的根节点
/**
 * 判断是否为空
 * **/
    @Override
    public boolean isEmpty() {
        return this.root==null;
    }
/**
 * 插入节点**/
    @Override
    public void insert(T a ) {
      root= insert(this.root,a);
    }
/**
 * 辅助主方法递归插入
 * **/
    private BinaryTreeNode<T> insert(BinaryTreeNode<T> root, T a) {
        if (root == null) {

            BinaryTreeNode<T> Node = new BinaryTreeNode<>(a);
            return Node;

        } else {
            int i = a.compareTo(root.Element);
            if (i < 0) {
                root.setLeft(insert(root.left, a));

            } else if (i > 0) {
                root.setRight(insert(root.right, a));
            }
            return root;
        }
    }
    @Override
    public void delete(T a) {

    }

    @Override
    public T findMax() {
        return null;
    }

    @Override
    public T findMin() {
        return null;
    }

    @Override
    public List preOrder() {
        System.out.println(root.Element);
        T element = root.left.Element;
        System.out.println(element);
        System.out.println(root.right.Element);
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


    /*面向 节点 设计数据结构*/
    public   static class BinaryTreeNode <T> {
           private T  Element;//
           private BinaryTreeNode<T> right;
           private BinaryTreeNode<T> left;


    public BinaryTreeNode(T element) {
        this(element,null,null);
    }

    public BinaryTreeNode(T element,BinaryTreeNode left, BinaryTreeNode right) {
           this.Element=element;
           this.left=left;
           this.right=right;
    }

    public T getElement() {
        return Element;
    }

    public void setElement(T element) {
        Element = element;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }
}










}
