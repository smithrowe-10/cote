package com.korit.study.week05;

import java.util.Arrays;
import java.util.Scanner;

/*
    이진 검색
    반드시 오름차순 또는 내림차순이 선행되어야 한다.
 */
public class Ex53 {

    public static void main(String[] args) {

        int[] arr = {6, 3, 1, 7, 9, 10, 8, 4, 2};
        Scanner sc = new Scanner(System.in);

        System.out.print("찾을 숫자를 입력해주세요: ");
        int n = sc.nextInt();


        int idx = BinSearch.search(arr, n);
        if(idx == -1) {
            System.out.println("찾는 숫자가 존재하지 않습니다.");
        } else {
            System.out.printf("찾는 숫자 %d는 arr[%d]에 존재합니다%n", n, idx);
        }
    }

}

class BinSearch{
    static int search(int[] arr, int key) {
        // 정렬
        Arrays.sort(arr);
        int start = 0;  // 배열의 첫번째 인덱스
        int end = arr.length - 1; // 배열의 마지막 인덱스
        do {
            // 가운데 인덱스 찾기
            int center = (start + end) / 2;
            if(arr[center] == key) {
                return center;
            }
            if (key > arr[center]) {
                start = center + 1;
            } else {
                end = center - 1;
            }

        } while (start <= end);

        return -1;
    }
}
