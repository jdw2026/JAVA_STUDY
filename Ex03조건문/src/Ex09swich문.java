
public class Ex09swich문 {

	public static void main(String[] args) {
		
		
		int num = 20;
		
		//num이 20을 가지고 있으면 "20", 30을 가지면 "30"
		//그 나머지 값을 가지고 있으면 "다른수"
		
		
		//switch(식이나 값을 적어준다.true false가 꼭 아니여도 괜찮음)
		switch(num) {
		case 20: //case 는 세미콜론 말고 콜론 씀
			System.out.println(20);
			break;//switch 문을 멈추고 다음문장을 실행하도록 하는 명령어, 생략가능
		          //브레이크를 안쓰면 20이 맞으면 20 출력하고 다음 케이스 가서 출력해버림
			      //switch는 비교하는게 아니라서...
		case 30:
			System.out.println(30);
			break;
		
		default :
			System.out.println("다른 수");
		
		}
		
		
		

		

	}

}
