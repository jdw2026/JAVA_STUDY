package 링크드리스트;

public class LinkedList {
	
	//첫번째 노드의 주소값만 가지고 있는 노드를 만들어줘야함 head 라고 부름.
	private Node head;
	private Node ptr; //선택 포인터(검색에 사용) ->데이터 삽입하면 포인터 옮기기, 지워도 옮기기..등..
	
	public LinkedList() {
		head = null; // 처음에는 데이터가 없으니까 초기화
		ptr = null;
	}
	
	//head  쪽으로 노드 삽입
	public void addFirst(String data) { //삽입할 데이터만 지정
		Node a = head; //지금 현재 첫번째 데이터의 참조값을 저장해놓기 위함.
		head = new Node(data, a);//새로 삽입할 노드(주소부에 원래 첫번째 였던 노드의 참조값을 저장할 수 있음)
		
	}
	
	//head 쪽에서 노드 삭제
	public void removeFirst() {
		if(head!=null) {//헤드 : 첫번째 노드에 주소값이 있을때
			//첫번째 노드가 가지고 있는 주소부를 헤드에 넣어주기
			head = head.getNext(); //두번째 노드의 참조값을 head 에게 준다. 그러면 첫번째 참조값을 가지고 잇는건 없기에 없어지는거나 마찬가지
		}
	}
	

}
