package 메서드;

public class Ex01메서드 {

	public static void main(String[] args) {
		
		//메서드를 사용 하는 이유 - 반복되는 코드를 지워주고 유지보수가 유용하기 위해
		
		
		//매개변수와 전달인자의 갯수/데이터 타입은 항상 일치해야함
		
		System.out.println(sum(10,20,500));
		System.out.println(sum(10,25,500));
		System.out.println(sum(13,20,500));
		
	}
	
	//메서드 작성은 main 밖에서 이루어진다.
	//+ 하는 기능을 그냥 만들어 놓고 필요할때마다 가져다가 사용해야지!
	//public : 접근제한자(공공의 라는 의미 : 클래스 내/외부에서 마음대로 접근이 가능하도록 해줌)
	//static : 저장소(매우 작은 공간으로 다 static을 쓰면 안됨. 아껴 써야함
	//리턴타입 : 돌려받는 결과값의 데이터 타입 (여기서는 더하기니까 숫자를 받아야 하므로 int)
	//메서드명(호출명) : 실행시킬때 부를 이름
	//(매개변수) : 메서드 안에서 사용될 수 있는 변수, 단 선언만 한다.
//	int a; //선언
//	a = 3; //초기화
//	a=5; //재할당
	public static int sum(int a, int b, int c) {
		//리턴타입에 자료형이 명시되어있으면 return 이라는 키워드가 따라온다.
		//모든 경우에 대해서 꼭 return값이 있어야 한다.
		
//		int result = a+b+c;
//		return result; 이렇게 두줄 또는 아래처럼.
		return a+b+c+365; //--a+b+c에 추가적으로 365를 다 더하고 싶을때는 리절트에 써준다.
	}

}
