package 큐;

public class IntQueue {
	//필드
	private int[] que; //큐 배열
	private int capacity;// 큐의 용량
	private int front;//맨 앞의 요소 위치
	private int rear;// 맨 뒤의 요소 위치
	private int num; //현재 데이터 개수
	
	//생성자
	public IntQueue(int maxlen) {
		que = new int[maxlen];
		capacity = maxlen;
		num = 0;
		front = 0;
		rear = 0;
	}
	//메서드
	//인큐(데이터 삽입)
	public int enque(int x) {
		que[rear++] = x;
		num++;
		return x;
		
	}
	//디큐(데이터 삭제)
	public int deque() {
		num--;
		return que[front];
		
	}
	//peek : 맨앞(첫번째)에 데이터 확인
	public int peek() {
		return que[front];
	}
	//clear : 큐 비우기
	public void clear() {
		num=0;
		front = 0;
		rear = 0;
	}
	//indexOf : 특정값의 배열 상 인덱스 확인
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			if(que[i]==x) {
				return i;
			}
		}return -1;
	}
	//size : 쌓여있는 데이터 개수
	public int size() {
		return capacity;
	}
	
	//isEmpty : 큐가 비어있는지 확인
	public boolean isEmpty() {
		return num==0;
	}
	//isfull : 큐가 가득 차 있는지 확인
	public boolean isFull() {
		return num==capacity;
	}
	
	//dump : 큐안에 데이터를 front~ rear 순서로 출력	
	public void dump() {
		
	}

}
