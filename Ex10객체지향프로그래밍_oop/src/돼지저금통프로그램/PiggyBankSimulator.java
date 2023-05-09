package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	//돼지 저금통 객체 생서
		PiggyBank pb = new PiggyBank();
		
		System.out.println("===돼지 저금통===");
		
	//입금기능 메소드 호출
		
		
		
		System.out.print("입금할 금액 입력 : ");
		int 입금할금액 = sc.nextInt();
		pb.deposit(입금할금액);
		//pb.deposit(50000);
	
	//출금기능 메소드 호출
		System.out.print("출금할 금액 입력 " );
		int 출금할금액 = sc.nextInt();
		pb.withdraw(출금할금액);
		//pb.withdraw(10000);
		
	//잔액확인 메소드 호출	
		int m = pb.showMoney();
		System.out.println(m+"원 남았습니다.");
		//. : 참조한다.
		

	}

}
