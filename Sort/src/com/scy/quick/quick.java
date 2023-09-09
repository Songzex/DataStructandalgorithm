package com.scy.quick;

public  class quick {
    public static  void  sort(int arry[] ,int start,int end ){
        if(start>=end) {
            return;
        }else{
            int p = parttion(arry, start, end);
            sort(arry,start,p-1);
            sort(arry,p+1,end);
        }

    }

    private static int parttion(int[] array, int start, int end) {
        int pivot = array[0];
        int biggest_suffer = 0;
        int temp;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= pivot) {
                biggest_suffer++;
                temp = array[biggest_suffer];
                array[biggest_suffer] = array[i];
                array[i] = temp;
            }
        }

        array[0]=array[biggest_suffer];
        array[biggest_suffer]=pivot;
        return biggest_suffer;

    }
}