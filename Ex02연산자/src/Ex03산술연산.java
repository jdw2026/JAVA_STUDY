import java.util.Scanner;

public class Ex03산술연산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("JAVA 점수 입력 : ");
		int jScore = sc.nextInt();
		System.out.print("WEB 점수 입력 : ");
		int wScore = sc.nextInt();
		System.out.print("ANDROID 점수 입력 : ");
		int aScore = sc.nextInt();
		
		System.out.println("합계 : " + (jScore+wScore+aScore)); 
		System.out.println("평균 : " + (((float)(jScore+wScore+aScore)/3)));
		System.out.printf("평균 : %.2f",(float)(jScore+wScore+aScore)/3);

   }

}
