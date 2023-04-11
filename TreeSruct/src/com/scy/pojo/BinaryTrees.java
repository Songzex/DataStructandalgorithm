package com.scy.pojo;

import java.util.List;

/**
 * 此接口主要定义二叉树的操作类型
 *
 * **/
public interface BinaryTrees<T> {
      boolean isEmpty();
      void insert(T a);
      void  delete(T a);
      T findMax();
     T findMin();
      List<T> preOrder();
      List<T> inOrder();
      List<T> postOrder();
      void  print();





}
