import java.util.ArrayList;

public class Ex01ArrayList {

	public static void main(String[] args) {
		
		//1. ArrayList 생성 ->heap 영역에
		//  ->ArrayList 생성된 참조값 저장 -> 참조변수(레퍼런스 변수) 선언
		ArrayList<String> al = new ArrayList<String>();
		//ArrayList<E>(초기 크기->생략가능(아무것도 안적으면 기본값은 10));
		
		//2. 요소 삽입
		al.add("Hello"); //어레이리스트의 0번에 자동으로 들어감.
		al.add("Hi");  //1번에 자동 저장
		al.add("Java"); //2번
		
		//3. 요소 개수
		al.size(); //출력은 안되고 가져오기만함
		System.out.println(al.size()); //출력하기
		
		//4. 요소 중간삽입
		al.add(1,"Python");  //앞쪽에는 삽입하려는 인덱스 번호, 뒤에는 요소
		System.out.println(al.size()); 
		
		//5. 특정 인덱스에 있는 요소 알아내기
		al.get(0); //0번 인덱스에 있는 요소를 가져오기만함.
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		
		
		for(int i=0; i<al.size(); i++) { //인덱스 번호 쓰려면 get 으로
			System.out.println(al.get(i));
		}
		
		//확장 for문( for~each문)
		for(String s : al) {  //인덱스 번호 안쓰면 for each문으로. 값만 순서대로 가져올때
			System.out.println(s);
		}
		
		
		//6. 특정 요소 삭제하기
		String a = al.remove(2); // 삭제된 요소가 반환도 가능.
		System.out.println(al.size());
		
		//al.remove(3);
		
		//7. 모든 요소 삭제
		al.clear();
		System.out.println(al.size());
		

	}

}
