package 스택;

public class StackTest {
	
	//필드
		private int[] stk; //값을 저장할 배열
		private int capacity; //스택의 용량 저장(최대 몇개의 데이터가 저장될 수 있는지)
		private int ptr; //스택 포인터 (현재까지 쌓여잇는 데이터의 수 나타냄)
						//비어있으면 -> 0  / 가득차있으면 -> capacity
		
		
		//생성자(메서드)
		public StackTest(int maxlen) {
			stk = new int[maxlen];
			capacity = maxlen;
			ptr = 0;
		}


		//데이터 삽입 : 위(뒤)쪽에서만 삽입 가능
			public int push(int x) {
				stk[ptr] = x;
				ptr++;
				return x;
			}


		//데이터 꺼내기 : 위(뒤)쪽에서만 꺼내는 작업 가능
			public int pop() {
				--ptr;
				return stk[ptr];
			}


		//제일 위에 있는 데이터 확인
			public int peek() {
				return stk[ptr-1];
			}

		//스택 비우기
			public void clear() {
				ptr =0;
			}

		//특정한 값이 몇번 인덱스에 있는지 찾기 :top에서 부터
			//스택은 데이터를 찾을때 위쪽부터 찾는다.
			public int indexOf(int x) {
				for(int i=ptr-1; i>=0; i--) {
					if(stk[i]==x) {
						return i;
					}
				}
				return -1;
			}


		//스택에 쌓여있는 총 데이터 개수 반환
			public int size() {
				return ptr;
				
			}


		//스택이 현재 비어있는지 확인
			public boolean isEmpty() {
				return ptr==0;
			}

		//스택이 가득 차있는지 확인
			public boolean isFull() {
				return ptr==capacity;
			}

		//스택안에 있는 모든 데이터 출력 먼저넣은 데이터부터 출력
			public void dump() {
				if(ptr==0) {
					System.out.println("스택이 비어있습니다");
				}else {
					for(int i=0; i<ptr; i++) {
						System.out.print(stk[i]+" ");
					}
				}System.out.println();
				
			}
	
	

}
