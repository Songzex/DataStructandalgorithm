package com.scy.Merging;
/**
 * 归并排序
 *时间复杂度  O(log2n)
 *
 *
 * **/
public  class Merging {

public static  int [] sort(int []array,int low,int high){
    if(array.length<2){
        return array;

    } else if (array.length==2) {
       if (array[0]>array[1]){
           int temp;
           temp=array[0];
           array[0]=array[1];
           array[1]=temp;

       }

    }
    {
        int  mid=array.length/2;//取商
       sort(array,0,mid);
       sort(array,mid+1,array.length-1);

    }



    return null;

}
 public  static  int[] merge(){

    return null;
 }





}
