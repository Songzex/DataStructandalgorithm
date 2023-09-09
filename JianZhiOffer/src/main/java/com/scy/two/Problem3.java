package com.scy.two;
/**
 * 数组第8题
 * */
public class Problem3 {

    public static   int  minStr( int key,int [] array){
        int low=0;
        int sum=0;
        int minlength=Integer.MAX_VALUE;
        for (int right=0;right<array.length;right++){
            sum+=array[right];
            while(sum>=key&&low<right){
                minlength= Math.min(minlength, right - low + 1);
                sum-=array[low++];

            }
             return minlength ==Integer.MIN_VALUE? 0:minlength;


        }



        return 0;
    }















}
