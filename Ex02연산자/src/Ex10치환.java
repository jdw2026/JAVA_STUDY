
public class Ex10치환 {

	public static void main(String[] args) {
		
		String left = "red";
		String right = "blue";
		
		String temp; // 임시 저장공간 선언 ,변수만선언 , 메모리에서 공간을 할당해줬는데 이전에 썼던 값이 남아있을수 있음.
		// String temp = null; -> 초기화를 함. 레퍼런스타입은 초기화할때 null을 넣음
		//int temp = null; 기본타입은 초기화 안됨. 레퍼런스 타입만 null로 초기화 가능
		// null 값으로 초기화를 해주면 누가 이전에 썼던 흔적을 완전히 지워버린다. 그리고 비어있는게아닌 빈 값을 넣은것이다.
		//또는 int temp = ""; 이렇게도 사용 가능
		temp = right; // left=red , temp=blue , right=blue    값할당
		right = left; //left=red ,  temp=blue , right=red
		left=temp; //left=blue, temp=blue , right=red
		
		System.out.println(left); //blue
		System.out.println(right); //red
	}

}
