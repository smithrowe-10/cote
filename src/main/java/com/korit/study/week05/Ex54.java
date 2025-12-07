package com.korit.study.week05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 7, 9, 10, 8, 4, 2};
        Scanner sc = new Scanner(System.in);

        System.out.print("찾을 숫자를 입력해주세요: ");
        int n = sc.nextInt();

        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr, n);
        System.out.println(idx);
    }
}
