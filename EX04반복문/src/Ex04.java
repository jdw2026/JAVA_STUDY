import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
//		
//		키보드로부터 입력한 숫자를 입력받아 홀수와 짝수가 각각 몇 개
//		입력되었는지 출력하는 프로그램을 작성하시오.
//		(단, -1을 입력한 경우 프로그램 종료)
//		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		int input=0;
		int sum2=0; //지금까지 입력한 모든 수의 합 저장(누적 의 합)
		int odd=0; //홀수 개수
		int even=0; //짝수개수
		
		
		while(true) {
			System.out.print("숫자 입력 : ");
			input = sc.nextInt();
			
			if(input==-1) {
				break; // 만나는 순간 반복문 나감.
			}
			
			if(input%2==1) {//홀수일때
				++odd;
				
			}else {//나머지 0일떄 ->짝수일때
				++even;
			}
			sum2 += input;
		}
		System.out.println("누적결과 : " + sum2);


	}

}
