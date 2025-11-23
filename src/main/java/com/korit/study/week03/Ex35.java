package com.korit.study.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*

    Queue(백준 2161)

 */

public class Ex35 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();
        // 입력 받아서 큐에 담는다
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            queue.add(i);
        }


        // 카드가 한장 남을때까지 반복한다
        while (queue.size() > 1) {
            // 버린다 (출력한다)
            System.out.printf("%d ", queue.poll());

            // 빼서 맨뒤에 추가한다
            queue.add(queue.poll());

        }
        System.out.print(queue.peek());


    }

}
