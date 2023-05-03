package 메서드;

public class Ex07메서드 {

	public static void main(String[] args) {
		
//		2개의 양수를 받아 2개의 숫자중 더 큰수를 반환하는 메소드
//		만약 두 숫자가 같다면 0을 반환.
		
		int num1=10;
		int num2=24;
		int result = largerNumber(num1,num2);
		System.out.println("큰수 확인: "+ result);
	}
	//largerNumber 메서드 만들기
	//메서드 명 : largerNumber
	//전달인자 num1, num2 : int ---> 매개변수 int 2개
	//라저넘버의 리턴타입이 int 이다.
	//result 에 출력하는 기능은 불가능 하다.
	//보통 전달인자에 사용되는 이름이랑 매개변수에 사용되는 이름을 일치시킨다. 위에 메인 메서드에 num1, num2를 라저네임에도 쓰는것.
	public static int largerNumber(int num1, int num2) {
		
		if(num1>num2) {//num1이 더 크면 num1 을 결과값으로 보내주자
			int result = num1;
			return result;
			//return num1; 이렇게 한줄 써도 가능
		}else if(num1<num2) {//num2 가 더 크면 num2를 결과값으로 보내주자
			int result = num2;
			return result;
			//return num2; 이렇게 한줄 써도 가능
		}else {//num1==num2 같으면, 0을 결과값으로 보내주자
			int result = 0;
			return result;
		}
		
	}

}
