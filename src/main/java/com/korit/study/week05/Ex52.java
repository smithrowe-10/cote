package com.korit.study.week05;

import java.util.Scanner;

// DB의 쿼리문 SELECT 알고리즘도 비슷한 방식
public class Ex52 {
    public static void main(String[] args) {

        int[] arr = {6, 3, 1, 7, 9, 10, 8, 4, 2};
        Scanner sc = new Scanner(System.in);

        System.out.print("찾을 숫자를 입력해주세요: ");
        int n = sc.nextInt();

        int idx = SequenceSearch.search(arr, n);
        if(idx == -1) {
            System.out.println("찾는 숫자가 존재하지 않습니다.");
        } else {
            System.out.println(String.format("찾는 숫자 %d는 arr[%d]에 존재합니다", n, idx));
        }
    }
}

// 선형 탐색
// 실무나 코테에서는 실행시간 중요하기때문에 어떤 알고리즘으로 탐색할건지 중요함
class SequenceSearch {
//  스테틱은 호출안해도 메모리 영역에 바로 올라감 필요한 것들만 올리기
    static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }

        return -1;
    }
}