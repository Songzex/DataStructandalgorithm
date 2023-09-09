package com.scy.bst;

import java.util.List;

/**
 *
 * 顶层接口 对外提供方法 也是定义了一些规范
 * 此接口主要定义二叉树的操作类型
 *
 * **/
public interface BinaryTrees<T> {
      boolean isEmpty();
      void insert(T a);
      void remove(T a);
      T findMax();
      T findMin();
      List<T> preOrder();
      List<T> inOrder();
      List<T> postOrder();
      void  print();





}
