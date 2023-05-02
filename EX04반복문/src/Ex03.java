import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		
//		키보드로부터 입력한 숫자를 누적하여 누적결과를 출력해주는 프
//		로그램을 작성하시오.
//		(단, -1을 입력한 경우 프로그램 종료)
//		(while문 / do~while문 모두 작성)
		
		Scanner sc = new Scanner(System.in);
		
	
		
//		내가 쓰다가 멈춘거...........
//		int num = 1;
//		int sum = 0;
//		
//		while(num>0) {
//			System.out.print("숫자 입력 : ");
//			num = sc.nextInt();
//			sum = num;
//			if(num==-1) {
//				break;
//			}
//		}
//		
//		System.out.println("누적결과 : ");
//		
		
		
		
		int input=0;
		int sum2=0; //지금까지 입력한 모든 수의 합 저장(누적 의 합)
		while(true) {
			System.out.print("숫자 입력 : ");
			input = sc.nextInt();
			
			if(input==-1) {
				break; // 만나는 순간 반복문 나감.
			}
			sum2 += input;
		}
		System.out.println("누적결과 : " + sum2);
		

	}

}
