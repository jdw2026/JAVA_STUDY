import java.util.Scanner;

public class Ex07삼항연산자문제2 {

	public static void main(String[] args) {
		//ctrl + shift + f -> 자동정렬
		//상자 하나에는 농구공이 5개 들어갈 수 있습니다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("필요한 상자의 수 : " + (num%5==0? num/5 : num/5+1));
		
		
		//선생님풀이
		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();
		
		int box = ((ball%5==0)? ball/5 : ball/5+1);
		System.out.print("필요한 상자의 수 : " + box);		

	}

}
