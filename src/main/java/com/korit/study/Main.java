package com.korit.study;

import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] dart = {0, 0, 0};
        Map<Character, Integer> map = new HashMap<>();
        map.put('S', 1);
        map.put('D', 2);
        map.put('T', 3);

        String n = "";
        for (int i = 0, k = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            if (ch == 'S' || ch == 'D' || ch == 'T') {
                dart[k++] = (int) Math.pow(Integer.parseInt(n), map.get(ch));
                n = "";
            } else if (ch == '*') {
                dart[k - 1] *= 2;
                if (k - 2 >= 0) dart[k - 2] *= 2;
            } else if (ch == '#') {
                dart[k - 1] *= -1;
            } else {
                n += ch;
            }
        }
        return answer;
    }
}