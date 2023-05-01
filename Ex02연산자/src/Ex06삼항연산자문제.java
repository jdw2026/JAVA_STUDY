import java.util.Scanner;

public class Ex06삼항연산자문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		int num3 = num-num2;
		System.out.print("두 수의 차 : " + (num3>=0? num3 : -num3));
		
		//또는 이렇게 System.out.println("두 수의 차 : " + (num>num2? num-num2 : num2-num));

	}

}
