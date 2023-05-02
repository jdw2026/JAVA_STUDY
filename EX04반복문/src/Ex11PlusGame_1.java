import java.util.Random;
import java.util.Scanner;

public class Ex11PlusGame_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		//두수의 합이 일치하지 않았을 떄만 다사ㅣ 실행할것인지 물어보고
		// y를 입력하면 계속 실행 n을 입력하면 프로그램 종료
	
		System.out.println("===Plus Game===");
		
		int chance = 3;
		
		while(true) {
		int num4 = rd.nextInt(50)+1;
		int num5 = rd.nextInt(50)+1;
		
		
		//가져온 랜덤한 숫자 2개 출력하기
		System.out.print(num4+ "+" + num5 + "=" );
		// 답 입력 받기
		int answer = sc.nextInt();
		//사용자가 입력한 정답이랑 실제답이 일치하는지 판단하기!
		if(answer==num4+num5) {
			System.out.println("Success");
			
		}else {//실패하면 계속할건지 물어보기
			System.out.println("Fail");
			System.out.print("계속 하시겠습니까? >> ");
			String answer2 = sc.next();
			
			chance--;
			if(chance == 0) {
				System.out.println("종료합니다.");
			}
			
			int a = 0;
			while(answer2.equals("Y")) {
						
				//가져온 랜덤한 숫자 2개 출력하기
				System.out.print(num4+ "+" + num5 + "=" );
				answer = sc.nextInt();
			
				if(answer==num4+num5) {
					System.out.println("Success");
				}
				
			}System.out.println("종료합니다.");
			
		   }
		}
		
		// 1. 출력문
		// 한번만 출력 ---> while문에 들어갈 필요가 없음
		
		// while{
		// 2. 랜덤한 숫자 2개를 가져온다
		// 출력
		// 답을 입력
		// 판단 --> s/f
		// s 계속 while문 실행
		// f 사용자한테 진행 할껀지 물어본다 ---> 틀린횟수가 카운트 (3번만)
		//      : n/y
		// n----> break;
		// y----> 계속 실행
		
		
		// }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
