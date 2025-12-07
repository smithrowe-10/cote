package com.korit.study.week05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이를 설정하세요: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("배열에 넣을 수 (%d): ", i + 1);
            x[i] = sc.nextInt();
        }
        System.out.println("버블 정렬 전");
        System.out.println(Arrays.toString(x));
        bubbleSort(x);
        System.out.println("버블 정렬 후");
        System.out.println(Arrays.toString(x));

    }
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {// 오름차순   반대 : arr[i] < arr[j] 내림차순
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }

        }
    }
}
