package com.korit.study.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex36 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {

            queue.add(i);

        }

        while (queue.size() > 1) {

            queue.poll();

            queue.add(queue.poll());
        }

        System.out.println(queue.peek());

    }

}
