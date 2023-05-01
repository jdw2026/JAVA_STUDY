import java.util.Scanner;

public class Ex08삼항연산자문제3 {

	public static void main(String[] args) {
		// 시급계산기 입니다. 기본 시급은 9,000원이고
		// 8시간이 넘을 경우 초과 시간은 시급의 1.5배를 책정해줍니다

		Scanner sc = new Scanner(System.in);
		System.out.print("노동시간을 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print(num <= 8 ? num * 9000 : (8 * 9000) + (num - 8) * 13500);

		// 선생님풀이
		// int work = sc.nextint();
		// 기본시급 : 9000
		// 8시간 이하 근무 : 9000*일한 시간
		// 8시간 초과 근무 : 8*9000 + (work-8) * 9000 *1.5

		// 실수 -> 정수 형변환 절대 자동형변화 해주지 않음
		// 같은 크기더라도 실수가 표현범위가 더 넓기 때문
		// int pay = ((work>8)? 8*9000+(work-8)*9000*1.5 : 9000*work);
		// 위에 int를 밑에 double로 변경.
		// int 기본시급 = 9000; -> 매년 시급이 인상될수있어서. 변수로 저장해두고 변수값만 수정하면됨

		// double pay = ((work>8)? 8*기본시급+(work-8)*기본시급*1.5 : 기본시급*work);

		// System.out.print("총 임금은 " + pay + "입니다");
		// System.out.printf("총 임금은 %.0f원 입니다" , pay);
	}

}
