package com.scy.bst;

import java.util.ArrayList;
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
    /**
     * 既然是在二叉搜索树中插入数据 呢就要不改变书的性质
     * 如果你的二搜索叉树就是一个空的 把该节点跟节点
     * 如果不是 和根节点比较 ,>  < 情况 按规则插入 如果大于就放在树的右边在右子树里边也要按规则插入 如果小于就放在左子树里边  左子树也有按规则插入、
     * 我们的树是我们基础操作对象 就是主要操作对象
     * **/
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
    /**
     * 删除某一个节点
     * 首先：情况分类
     * 你找到了该节点 然后遇到了 该节点的左节点和右节点都存在 或者是左右节点只有一个节点存在。
     * 当只有一个节点时候：用三目运算 如果是右子树存在 同下 如果是左子树删除然后把该节点移到这里
     * 当有两个节点的时候:从右节点中能拿到最小的节点 删除右子树中的该节点 也就是递归的调用自己
     * **/
    public void remove(T a) {
        root=remove(root,a);
    }
    public BinaryTreeNode<T> remove(BinaryTreeNode<T> root,T t) {
        if(root==null) {
            return root;
        }
        int aa= (t.compareTo(root.Element));
      if(aa>0) {
          BinaryTreeNode<T> node = remove(root.right, t);
          root.setRight(node);
      }else if (aa<0) {
          BinaryTreeNode<T> node = remove(root.left, t);
          root.setLeft(node);
      }else {
          //三目运算符 处理只有一个子节点的情况
          BinaryTreeNode<T> node = (root.getLeft() == null) ? root.getRight() : root.getLeft();
          root=node;
      }
      return root;
    }
/**
 *  依照二叉查找树的特点我们 只能去树的根节点的右边右子树里边找到最大值。
 *  也是用递归实现 因为就是说 树本身就是一个递归的一个形式
 * **/
    @Override
    public T findMax() {
        return findMax(this.root).getElement();
    }
    /**
     *递归实现
     * **/
    public BinaryTreeNode<T> findMax(BinaryTreeNode<T> root) {
        if(root==null) {
            return root;
        } else if(root.getRight()==null) {
          return root;
        }
        return findMax(root.getRight());
    }

    /**
     *  依照二叉查找树的特点我们 只能去树的根节点的左边左树里边找到最小值。
     *  也是用递归实现 因为就是说 树本身就是一个递归的一个形式
     * **/
    @Override
    public T findMin() {
    return finmin(root).getElement();
    }

    public BinaryTreeNode<T>finmin(BinaryTreeNode<T> root ){
        if(null==root){
            return root;


        } else if (root.getLeft()==null) {

            return root;
        }
       return finmin(root.getLeft());
    }
    /**
     * 树的前序遍历 按照的规则和二叉树的规则遍历是一样的。
     * 按照根左右的方式遍历
     * 先遍历跟几点 然后按照先序遍历左子树 在然线序遍历右子树
     * **/
    @Override
    public List<T> preOrder() {
        ArrayList<T> list = new ArrayList<T>();
       if(isEmpty()) {
           /**首先判别是不是空**/
           return list;
       }else {
           postOrder(this.root,list);
       }

        return null;
    }
/**
 * 方法的重载 如果不重载就需要把 集合的引用放到接口里也可以变成 成员变量 修饰符为public
 * 但是在这里就是我们的递归方法了
 * **/
    private void postOrder(BinaryTreeNode<T> root, ArrayList<T> list) {
        if(root==null) {
            return;
        }
        list.add(root.Element);
        postOrder(root.getLeft(),list);
        postOrder(root.getRight(),list);
    }
    /**
 * 中序遍历  按照左根右
 * **/
    @Override
    public List inOrder() {
        ArrayList<T> list = new ArrayList<>();
        if(isEmpty()){
            return  list;
        }else {
            inOrder(root,list);
        }
        return list;
    }
    public  void inOrder( BinaryTreeNode<T> root,List<T> result){
         if (root==null){
             return;//这中情况就直接去返还结束方法的运行
         }
         inOrder(root.getLeft(),result);//先遍历左子树
         result.add(root.getElement());//遍历根节点
         inOrder(root.getRight(),result);//再遍历右子树


    }
/**
 * 后序遍历  按照左右根
 * **/
    @Override
    public List postOrder() {
        ArrayList<T> list = new ArrayList<>();
        if(isEmpty()){
            return list;

        }else {
            postorder(root,list);
        }


        return null;
    }
    public void  postorder( BinaryTreeNode<T> root,List<T> list){
       if(root==null){
           return;//结束方法运行

       }
       postorder(root.getLeft(),list);//遍历左子树
       postorder(root.getRight(),list);//遍历右子树
       list.add(root.getElement());//插入根节点


    }


/**
 * 输出树信息
 * **/
    @Override
    public void print() {
     if(isEmpty()){
         System.out.println("null");
         return;

     }else {
         PRINT(root);
        }

    }
    public  void  PRINT(BinaryTreeNode<T> root){
            if (root!=null){
                T leftDate=null;
                T rightDate=null;

            if (null!=root.getLeft()){
                leftDate = root.getLeft().getElement();

            }
            if (null!=root.getRight()){
                rightDate = root.getRight().getElement();
            }
        System.out.printf("current: %s,lef:%s rig:%s",root.getElement(),leftDate,rightDate);
            PRINT(root.getLeft());
            PRINT(root.getRight());

    }
        }

    /**面向 节点 设计数据结构**/
    public   static class BinaryTreeNode <T> {
           private T  Element;// 节点值域
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
