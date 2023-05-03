package 메서드;

public class Ex03매o리x {

	public static void main(String[] args) {
		// 매개변수는 있는데 리턴타입은 없는거
		
		//결과값은 3 입니다.
		sumPrint(1,2);
		//아래코드 : 출력하는 기능을 출력하라 라는 코드는 사용 불가.
		//System.out.println(sumPrint(1,2));
		

	}
	//void란 리턴타입이 없다는 뜻
	//돌려주는 결과값에 데이터 타입이 없음
	//보이드는 기능 자체를 가지고 있는 경우가 많음.예)출력 기능, 랜덤 수 돌려주는 기능 등..
	public static void sumPrint(int a, int b) {
		//void가 리턴타입으로 오면, return 이라는 키워드가 필요 없음
		System.out.println("결과 값은 "+(a+b)+"입니다");
	}
	

}
