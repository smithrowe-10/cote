package com.korit.study.week02;
/**
 * 게시판
 */
public class Board {
	private int no = 0;
	private String title = "";
	private String cn = "";
	private String writer = "";
	
	public Board() {} //생성자(생략가능하다)
	public Board(int no, String title, String cn, String writer) {
		this.no = no;
		this.title = title;
		this.cn = cn;
		this.writer = writer;
	}
	public Board(int no, String title, String cn) {
		this.no = no;
		this.title = title;
		this.cn = cn;
		this.writer = "작성자1";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
}
