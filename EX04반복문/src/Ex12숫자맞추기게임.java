import java.util.Random;
import java.util.Scanner;

public class Ex12숫자맞추기게임 {

	public static void main(String[] args) {
		
		//숫자 게임 만들기
		
		
		//1. 랜덤, 스캐너 불러오기
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		//ctrl + shift + o : 한꺼번에 import 단축키
		
		
		
		//2. 출력문 만추기 게임 1번만
		System.out.println("=====1부터 100 사이 숫자 맞추기 게임!=====");
		//랜덤한 숫자 한개 -> 한번만 실행
		int num = rd.nextInt(101)+1;
		
		while(true) {
		//3. 입력하세요 출력문
			System.out.print("1과 100사이의 정수를 입력하세요 >>");
		//   사용자에게 입력받기
			int answer = sc.nextInt();
		//   랜덤한 숫자와 일치하는지 판단 s/f
			if(num != answer) {
				if(num>answer) {
					System.out.println("더 큰 수로 다시 시도 해보세요");
				}else {
					System.out.println("더 작은 수로 다시 시도 해보세요");
				}
			}
			if(num == answer) {
			System.out.println(answer + "정답입니다!!");
			break ;
			}
		//   s---> 정답으로 밖으로 빠지기
		//   f --> 다시 입력받기
		}

	}

}
