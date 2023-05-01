import java.util.Scanner;

public class Ex04산술연산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력: ");
		int result = sc.nextInt(); //사용자 초입력
		int h = result/3600;
		int m = (result%3600)/60;
		int s = (result-3600)%60; //-> result%60; 으로 해도 가능
		System.out.println(h+"시 "+ m + "분 " + s + "초");
		

	}

}
