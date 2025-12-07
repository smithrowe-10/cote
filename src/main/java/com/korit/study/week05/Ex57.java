package com.korit.study.week05;

import java.util.Arrays;

public class Ex57 {
    public static void main(String[] args) {
        int[] x = {1, 3, 5, 4, 6, 9, 8, 7, 10, 2};
        System.out.println("삽입 정렬 전");
        System.out.println(Arrays.toString(x));

        insertSort(x);
        System.out.println("삽입 정렬 후");
        System.out.println(Arrays.toString(x));
    }
    
    static void insertSort(int[] arr) {
        // 뒤에서부터 정렬
        for (int i = 0; i < arr.length; i++) {
            int j;
            int tmp = arr[i];
            for (j = i; j > 0 && arr[j - 1] > tmp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = tmp;
        }
    }
}
