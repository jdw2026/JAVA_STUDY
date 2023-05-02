import java.util.Random;
import java.util.Scanner;

public class Ex11PlusGame_1t {

	public static void main(String[] args) {
		
		//1.랜덤숫자, 입력하는 도구 가져오기
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		//2.plus game 출력문 ---> 한번만 출력
		System.out.println("===plus game===");
		
		//틀린 횟수 저장하는 변수
		int cnt=0;
		
		while(true) {
			
		//3. 랜덤한 숫자 2개를 가져온다
		int num1 = rd.nextInt(50)+1;
		int num2 = rd.nextInt(50)+1;
		//출력 예) 4+5
		System.out.print(num1 + "+" + num2 + "=");
		//사용자한테 답을 입력 받는다
		int answer = sc.nextInt();
		//입력한 답 == 실제답과 일치하는지 확인  ---> s/f -->판단한다 if문사용
		if(answer == num1+num2) {
			//s --> 랜덤문제 출력 . while 문 처음으로
			System.out.println("Success");
		}else {
			cnt++;
			
			if(cnt>2) {
				System.out.println("GAME OVER");
				break;
			}
			//틀렸다라고 판단하는 상태 --->틀린 횟수 +1해주기
			
			System.out.println("fail");
			System.out.print("계속하시겠습니까? >>");
			String answer2 = sc.next();
			if(answer2.equals("n")) {
				break;
			}
		}
		
		//f ---> 사용자한테 계속 할껀지 물어본다
		//       틀린 횟수도 +1
		//      사용자가 n/y 를 입력한다.
		//      y --> while 문 처음으로 돌아간다.
		//      n --> 종료. break;
		//3번에 들어간 코드들 계속 반복
		}
		
		//사용자가 틀린 횟수가 3번 이상이 되면 break ;
		

	}

}
