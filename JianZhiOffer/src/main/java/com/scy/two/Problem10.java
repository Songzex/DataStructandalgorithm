package com.scy.two;

/**
 * 数组第9题
 * */
/**
 *
 * 所有连续子数组中的值的乘积小于100的连续子数组个数
 *
 * */
public class Problem10 {
    public static  int count(int [] array,int key){
        int low=0;
        int product=0;
        int count=0;
        for (int high=0; high<array.length; high++){
            product*=array[high];
            while (low<high&&product>=key){
                product/=array[low--];

            }
            count+=high>=low ? high-low+1 :0;

        }

        return count;
    }

}






