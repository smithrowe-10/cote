package com.korit.study.week02;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Map을 이용한 로그인 로직
 * 1. 입력한 아이디가 존재하는지 검사
 * 2. 존재하면 비밀번호 확인(로그인성공/로그인실패)
 * 3. 존재하지 않으면 아이디가 없다고 표시
 */
public class Ex26 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("spring", "1234");
		map.put("summer", "5678");
		map.put("fall", "9876");
		map.put("winter", "172839");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호 입력");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			//1 아이디 존재여부
			if(map.containsKey(id)) {
				System.out.print("비밀번호 : ");
				String pswd = sc.nextLine();
				if(map.get(id).equals(pswd)) {
					System.out.println("로그인 성공");
					break;
				}else System.out.println("로그인 실패");
				
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		}
		
	}
}
