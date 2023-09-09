package com.scy.one;
/**
 * 第一章节第一题
 *
 *
 * **/
public class YunSuan {

    public static  int divideCore(int dividend,int divisor){

          int result =0;
          while(dividend<=divisor){
              int value =divisor;
              int quotient=1;
              while(value>=0xc0000000&& dividend<=value+value){//双与
                  quotient+=quotient;
                  value+=value;

              }

              result+=quotient;
              dividend-=value;

          }

        return  result;

    }
/**对结果的正负的一个优化*/
    public static int dividend(int dividend,int divisor){
        if (dividend==0x80000000&&divisor==-1){
            return Integer.MAX_VALUE;

        }
        int negative=2;
        if (divisor>0) {
            negative--;
            dividend=-dividend;

        }
        if (dividend>0) {
            negative--;
            divisor=-divisor;

        }

        int result=divideCore(dividend,divisor);
        return negative==1 ? -result:result;




    }





}
