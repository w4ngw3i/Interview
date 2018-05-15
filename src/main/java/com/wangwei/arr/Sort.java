package com.wangwei.arr;

/**
 * @Auther wangwei
 * @Date 2018/5/9 上午7:31
 */
public class Sort {

    public static void selectSort(int[] arr){
        for (int x = 0; x < arr.length-1; x++) {
            for (int y=x+1; y<arr.length; y++){
                if (arr[x] > arr[y]){
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }


    public static void bubbleSort(int[] arr){
        for (int x = 0; x < arr.length-1; x++) {

            for (int y=0; y<arr.length-x-1; y++){

                if (arr[y] > arr[y+1]){
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }

        }
    }
}



