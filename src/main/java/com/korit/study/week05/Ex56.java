package com.korit.study.week05;

import java.util.Arrays;

public class Ex56 {
    public static void main(String[] args) {
        int[] x = {1, 3, 5, 4, 6, 9, 8, 7, 10, 2};
        System.out.println("선택 정렬 전");
        System.out.println(Arrays.toString(x));

        selectionSort(x);
        System.out.println("선택 정렬 후");
        System.out.println(Arrays.toString(x));

    }

    // i번 인덱스와 i+1번인덱스를 계속 비교해서 작은수가 앞에 오게끔 하는 로직
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }
        }
    }
}
