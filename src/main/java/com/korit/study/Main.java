import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] dart = new int[3]; // 3번의 기회 점수 저장
        int k = 0; // dart 배열의 인덱스

        StringBuilder n = new StringBuilder();

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            // 1. 숫자일 경우 (10점 처리를 위해 StringBuilder 사용)
            if (Character.isDigit(ch)) {
                n.append(ch);
            }
            // 2. 보너스(S, D, T)일 경우
            else if (ch == 'S' || ch == 'D' || ch == 'T') {
                int score = Integer.parseInt(n.toString());
                int bonus = (ch == 'S') ? 1 : (ch == 'D' ? 2 : 3);

                dart[k++] = (int) Math.pow(score, bonus);
                n.setLength(0); // 다음 점수를 위해 초기화
            }
            // 3. 옵션(*)일 경우
            else if (ch == '*') {
                dart[k - 1] *= 2; // 현재 점수 2배
                if (k - 2 >= 0) {
                    dart[k - 2] *= 2; // 이전 점수도 있다면 2배
                }
            }
            // 4. 옵션(#)일 경우
            else if (ch == '#') {
                dart[k - 1] *= -1; // 현재 점수 마이너스
            }
        }

        // 모든 점수 합산
        for (int s : dart) {
            answer += s;
        }

        return answer;
    }
}