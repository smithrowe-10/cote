package com.korit.study.week02;


import java.util.List;
import java.util.Vector;

/**
 * 리스트(Vector)
 */
public class Ex22 {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		Board board = new Board();
		board.setNo(1);
		board.setTitle("제목1");
		board.setCn("내용1");
		board.setWriter("작성자1");
		list.add(board);
		list.add(new Board(2, "제목2", "내용2", "작성자2"));
		list.add(new Board(3, "제목3", "내용3", "작성자3"));
		list.add(new Board(4, "제목4", "내용4", "작성자4"));
		list.add(new Board(5, "제목5", "내용5", "작성자5"));
		list.add(new Board(6, "제목6", "내용6"));
		print(list);
	}
	
	private static void print(List<Board> list) {
		System.out.println("=======================================");
		System.out.println("번호\t제목\t내용\t작성자");
		for(int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.printf("%d\t%s\t%s\t%s\n",board.getNo(),board.getTitle(),board.getCn(),board.getWriter());
		}
	}
}
