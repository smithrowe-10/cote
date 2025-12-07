package com.korit.study.week05;

import java.util.TreeSet;
/*
    TreeSet
 */
public class Ex51 {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(90);
        scores.add(80);
        scores.add(100);
        scores.add(90);
        System.out.println(scores);
        // set은 중복 불가능이라 90이 한번만 나옴
        scores.add(70);
        scores.add(75);

        Integer score = null;
        score = scores.first();
        System.out.println("first: " + score);

        score = scores.last();
        System.out.println("last: " + score);

        score = scores.higher(88);
        System.out.println("higher: " + score);

        score = scores.lower(88);
        System.out.println("lower: " + score);
        // 88을 기준으로 큰 수, 작은 수 중 88에 가장 가까운 수

    }
}
