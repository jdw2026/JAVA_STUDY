import java.util.Random;
import java.util.Scanner;

public class Ex11PlusGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//랜던 기능 사용하기, 랜덤도 임포트해주기
		Random rd = new Random();
		
		
		int num = rd.nextInt(10);/// 0~9 사이 랜덤 숫자 출력
		//int num = rd.nextInt(10)+1; /// 뒤에 +1을 쓰면 1부터 랜덤 숫자가 시작한다. 2로 시작은 +2
		//System.out.println(rd.nextInt(10));
		//System.out.println(num);
		
		int num2 = rd.nextInt(10);
		
		// 랜덤게임 . 반복은 안함.
		
		System.out.println("===Plus Game===");
		System.out.print(num+ "+" + num2 + "=" );
		int num3 = sc.nextInt();
		
		if(num3==num+num2) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
		
		
		//아래부터 선생님 풀이
		
		//랜덤기능 사용하기, 스캐너 사용하기
		
		// : 덤기능 사용해서 랜덤한 숫자 2개 가져오기
		//나중에 답을 구할때 사용할예정이지 저장하기(변수)
		int num4 = rd.nextInt(50)+1;
		int num5 = rd.nextInt(50)+1;
		
		System.out.println("===Plus Game===");
		//가져온 랜덤한 숫자 2개 출력하기
		System.out.print(num4+ "+" + num5 + "=" );
		// 답 입력 받기
		int answer = sc.nextInt();
		//사용자가 입력한 정답이랑 실제답이 일치하는지 판단하기!
		if(answer==num4+num5) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}

	}

}
