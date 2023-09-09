package com.scy.two;
/**
 * 数组第6题
 * */
public class Problem {

    /**
     * 二分法查找 不断找中间数折半二分 与中间数比较
     */
    public static int twoSum(int key, int[] array, int low, int high) {
          if(low<=high){////数组长度够使
              int mid=low+(high-low)/2;
              if(array[mid]==key){
                  return mid;
              } else if (array[mid]>key) {
                  twoSum(key,array,low,mid-1);
              }else {
                  twoSum(key,array,mid+1,high);
              }
          }//数组长度不够用
        return -1;
    }

    /**
     * 暴力破解
     */
    public static int[] twoSums(int[] array, int key) {
        int i = 0;
        int j = array.length;
        while (i < j && key != array[i] + array[j]) {
            if (array[i] + array[j] < key) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{i,j};
    }
}