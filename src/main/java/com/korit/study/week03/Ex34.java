package ct.week03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열로 큐만들기
 */
public class Ex34 {
	public static void main(String[] args) {
		//add(1), peek(2), poll(3), clear(4), print(5), exit(0)
		Scanner sc = new Scanner(System.in);
		ArrayQueue q = new ArrayQueue(5);
		System.out.println("============== 배열로 큐 만들기 =============");
		System.out.println("1.add 2.peek 3.poll 4.clear 5.print 0.exit");
		System.out.println("==========================================");
		while(true) {
			//명령어를 입력받기
			System.out.print("명령어 입력 : ");
			int cmd = sc.nextInt();
			if(cmd == 0) break;//System.exit(0);
			switch(cmd) {
			case 1:
				System.out.println();
				System.out.print("데이터 입력 : ");
				int n = sc.nextInt();
				if(n < 0) System.out.println("양수만 입력하세요!");
				else System.out.println(q.add(n));
				break;
			case 2:
				System.out.println(q.peek());
				break;
			case 3:
				System.out.println(q.poll());
				break;
			case 4:
				q.clear();
				break;
			case 5:
				q.print();
				break;
			default:
				System.out.println("명령어를 잘못 입력하였습니다.");
				break;
			}
		}
	}
}

class ArrayQueue{
	private int[] queue; 	//배열큐
	private int max; 		//최대용량
	private int cnt; 		//현재 데이터 수
	private int front; 		//배열의 맨앞 커서
	private int rear;		//배열의 맨뒤 커서
	
	public ArrayQueue() {}
	public ArrayQueue(int max) {
		this.max = max;
		this.cnt = this.front = this.rear = 0;
		this.queue = new int[max];
		Arrays.fill(this.queue, -1);
	}
	
	public int add(int n) {
		if(cnt >= max) {
			System.out.println("Queue is Full");
		}else {
			queue[rear++] = n;
			cnt++;
			if(rear == max) rear = 0;
			return n;
		}
		return -1;
	}
	
	public int peek() {
		if(cnt <= 0) {
			System.out.println("Queue is Empty");			
		}else return queue[front];
		return -1;
	}
	
	public int poll() {
		if(cnt <= 0) {
			System.out.println("Queue is Empty");
		}else {
			int n = queue[front];
			cnt--;
			if(cnt <= 0) cnt = 0;
			queue[front++] = -1;
			if(front >= max) front = 0;
			return n;
		}
		return -1;
	}
	
	public void clear() {
		this.cnt = this.front = this.rear = 0;
		Arrays.fill(this.queue, -1);
	}
	
	public void print() {
		if(cnt <= 0) System.out.println("Queue is Empty");
		else {
			//System.out.println(Arrays.toString(this.queue));
			for(int n : queue) {
				if(n >= 0) 
					System.out.printf("%d ", n);
			}
			System.out.println();
		}
	}
}