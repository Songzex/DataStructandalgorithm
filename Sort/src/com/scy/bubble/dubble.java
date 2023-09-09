package com.scy.bubble;

public class dubble {
    public static void main(String[] args) {
        int[] aa = new int[6];
        int bb[]={2,9,4,7,1};
        for (int i=0;i<6;i++){
            aa[i]=i;
        }
        for(int i=0;i<bb.length-1;i++){
            for (int  j=i+1;j<bb.length;j++){
                if(bb[i]>bb[j]){
                    int temp=bb[i];
                    bb[i]=bb[j];
                    bb[j]=temp;
                }

            }

        }

    }










}
