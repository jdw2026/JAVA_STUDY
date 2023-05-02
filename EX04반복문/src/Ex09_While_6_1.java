import java.util.Scanner;

public class Ex09_While_6_1 {

	public static void main(String[] args) {
		
//		정수 2개를 입력받고 연산자를 선택받
//		으면 해당 연산결과를 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		//1.출력
		System.out.print("정수1 : ");
		//2.입력받기
		int num1=sc.nextInt();
		//3.출력
		System.out.print("정수2 : ");
		//4.입력받기
		int num2 = sc.nextInt();
		//5.출력 - 무슨연산으로 할건지
		System.out.print("연산자(+/-) : ");
		//6.연산자 입력받기
		String a = sc.next();
		//7.출력인데 조건 +면 +연산, -면 -연산 
		if(a.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		}else {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		}
		
		
	}

}
