package com.korit.study.week03;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex37 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> q = new LinkedList<>();

        System.out.print("총 큐개수 입력: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {

            q.add(i);

        }

        System.out.print("뽑을 수 입력: ");

        int m = scanner.nextInt();  // nextInt는 띄어쓰기로 구분

        int[] array = new int[m];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int cnt = 0; // 회전 수

        for (int arr : array) {
            // arr 숫자의 위치를 찾는다.
            int idx = q.indexOf(arr);

            // 위치 숫자 가운데 기준 큰지 작은지 여부
            if (idx <= q.size() / 2) {

                while (arr != q.peek()) {
                    q.addLast(q.pollFirst());
                    cnt++;
                }

            } else {
                while (arr != q.peek()) {
                    q.addFirst(q.pollLast());
                    cnt++;
                }
            }
            q.pollFirst();
        }

        System.out.println(cnt);

    }

}
