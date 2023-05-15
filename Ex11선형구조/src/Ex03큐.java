import java.util.LinkedList;
import java.util.Queue;

public class Ex03큐 {

	public static void main(String[] args) {
		
		//링크드리스트, 큐 모두 임폴트학.
		//메모리 공간을 효율적으로 활용하기 위해 큐는 링크드리스트를 활용
		Queue<Integer> q = new LinkedList<Integer>();
		
		//2. 큐에 요소 삽입 
		q.add(1);
		q.add(2);
		q.add(3);
		
		//3.가장 먼저 나갈 데이터를 반환. peek
		System.out.println(q.peek()); //맨위, 즉 첫째로 나갈수 있는 데이터
		
		//4. 요소 삭제
		System.out.println(q.remove());
		System.out.println(q.remove());
		

	}

}
