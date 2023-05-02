import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//		키보드로부터 입력받은 수가 10보다 작을 때만 계속 숫자를 입력
//		할 수 있는 프로그램을 작성하시오.
//		(while문 / do~while문 모두 작성)
		
		Scanner sc = new Scanner(System.in);
		
		int input=0;
		while(input<10){
			input = sc.nextInt();
		}
		
		System.out.println("while 문 탈출!");
		
		
		
		do {
			input = sc.nextInt();
		}while(input<10);
		
		
		
		
		
		
		while(true) {
			input = sc.nextInt();
			if(input>=10) {
				break;
			}
		}
		System.out.println("while(true) 문 탈출!");
		
	}

}
