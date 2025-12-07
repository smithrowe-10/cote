package com.korit.study.week05;

public class Ex58 {
    public static void main(String[] args) {

    }

    int solution(int n) {
        int answer = 0;
        for(int i = 0; i < 100; i++) {
            if (n / 3 == 0) {
                i++;
            } else if ((n - 3) / 10 == 0) {
                i++;
            }

        }

        return answer;
    }
}


