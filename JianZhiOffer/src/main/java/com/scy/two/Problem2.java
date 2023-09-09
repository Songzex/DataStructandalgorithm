package com.scy.two;

import com.scy.bst.LinkList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/**
 * 数组第7题
 * */
public class Problem2 {
    /**
     * 方法一
     * **/
    public static int[] twoSums(int[] array, int key ,int i,int j) {
        i = 0;
        j = array.length;
        while (i < j && key != array[i] + array[j]) {
            if (array[i] + array[j] < key) {
                i++;
            } else {
                j--;
            }
        }
        //把三原数组第一个放入数组里边。

        int i1 = i - 1;
        return new int[]{i,j,i1};
    }

/***
 * 方法一
 * */
public static LinkedList sumSort(int[] array,int key) {
    int low = 0;
    int high = array.length - 1;
    LinkedList<Integer> List1 = null;
    Arrays.sort(array);//排序
    if (low < high) { //检查长度够不够
        int i1 = key - array[0];
        for (int i = 1; i < array.length; i++) { //循环查找 另两个值
            int[] ints = twoSums(array, i1, i, array.length - 1);
            //去重  用LinkedList集合
            LinkedList<int[]> list = new LinkedList<>();
            list.add(ints);
        }
        return List1;
    }
    return null;
}

/**
 * 方法二
 *
 * **/
private static void threeSum(int []array,
                              int i,List<List<Integer>> result){
    int j=i+1;
    int k=array.length-1;
    while(j<k){
        if(array[i]+array[j]+array[k]==0){
            result.add(Arrays.asList(array[i]+array[j]+array[k]));
            int temp=array[j];
            while (temp==array[j]&&j<k){//跳过重复的元素
                ++j;
            }
        } else if (array[i]+array[j]+array[k]<0) {
            ++j;
        }else{
            --k;
        }
    }
}
/**
 * 方法二
 * */
public static  List<List<Integer>> sum(int nums[]){
    LinkedList<List<Integer>> lists = new LinkedList<>();
   if(nums.length>=3){
       Arrays.sort(nums);
       int i=0;
       while(i<nums.length-2){
           threeSum(nums,i,lists);
           int temp=nums[i];
           while(i<nums.length&&nums[i]==temp){
               ++i;

           }

       }


   }
return  lists;
}












}
