import java.util.LinkedList;

public class Ex04연결리스트 {

	public static void main(String[] args) {
		
		//1. 생성
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//데이터 추가
		list.addFirst(1); //가장 앞에 데이터 추가 0번인덱스
		list.addLast(2); //가장 뒤에 데이터 추가  1번인덱스
		list.add(1, 5); //1번 인덱스에 5 넣기
		
		
		for(Integer i:list) {
			System.out.println((i));
		}
		
		
		//데이터 가져오기
		System.out.println(list.get(1));
		
		//삭제
		//list.removeFirst(); //가장 앞에 데이터 삭제
		//list.removeLast(); //가장 뒤에 데이터 삭제
		//list.remove(0); //0번 인덱스 데이터 삭제
		//list.remove(); //비원두면 기본값이 0이라면 0번데이터 삭제. 맨앞 데이터 삭제
		
		//list.clear(); //모든 값 제거 
		
		//요소 개수 확인
		System.out.println(list.size());
		

	}

}
