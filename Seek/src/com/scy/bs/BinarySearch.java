package com.scy.bs;
/**
 * 折半查找 （二分法）
 * 条件：待查找的数据集 是顺序表（有序）的存储结构
 * 思想： 先找到表的中间值mid =(low+high)/2 low=1；high=array.length
 *
 *
 * **/
public class BinarySearch {
    public  static  int Search_Bin(int [] array ,int mid,int key){
        int low=0;
        int high=array.length-1;
        while (low<high){
            mid=(low+high)/2;
            if(array[mid]==key){
                return 1;
            } else if (array[mid]<=key){
                int i = mid + 1;
                return i;
            }else {
                int i = mid - 1;
                return  i;
            }
        }

        return -1;

    }
/*递归写法*/







}
