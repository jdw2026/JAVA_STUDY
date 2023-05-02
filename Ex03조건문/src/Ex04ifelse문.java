import java.util.Scanner;

public class Ex04ifelse문 {

	public static void main(String[] args) {
		
//		친구들과 점심을 먹은 후 총 금액의 1/n을 각자 지불하려고 합니다.
//		점심 총 금액과 사람 명 수를 입력받은 후 인 당 지불해야 하는 금액
//		이 10000원 이상이면 “10000원 이상 지불”금액이 10000원 미만이
//		면 “10000원 미만 지불”을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 금액 : ");
		int money = sc.nextInt();
		System.out.print("사람 명 수 : ");
		int people = sc.nextInt();
		
		if(money/people>=10000) {
			System.out.println("10000원 이상 지불");
		}else {
			System.out.println("10000원 미만 지불");
		}
		
		
		

	}

}
