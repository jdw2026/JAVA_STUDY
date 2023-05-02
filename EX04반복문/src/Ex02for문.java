import java.util.Scanner;

public class Ex02for문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//1. 1~100까지 중 3의 배수를 출력하세요.
		
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		
		
		//2. 3의 배수이면서 5의 배수를 출력하세요.
		
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
		

		//3. 한개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력
		
		//출력 자연수를 입력하세요
//		System.out.print("자연수를 입력하세요 : ");
//		//입력받기
//		int num = sc.nextInt();
//		//출력 - 입력받은 수의 배수를 10개 출력
//		
//		for(num; num; num*2;  )
			
			
		
		//3번문제 선생님 풀이
	      //4라고 한다면
//	    System.out.println(4*1);
//		System.out.println(4*2);
//		System.out.println(4*3);
//		System.out.println(4*4);
//		System.out.println(4*5);
		//출력문, 4, * 는 반복 
		//뒤에 있는 숫자는 1씩 증가한다.
		
			//4는 사용자가 입력한 숫자
		//1. 스캐너 가져오기
			System.out.print("자연수를 입력하세요 : ");	
		    int num2 = sc.nextInt();
			
			for(int i=1; i<=10; i++) {
				System.out.println(num2*i);
		}

	}

}
