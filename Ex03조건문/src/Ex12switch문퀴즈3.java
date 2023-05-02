import java.util.Scanner;

public class Ex12switch문퀴즈3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();
		
		System.out.println("--메뉴--");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >>");
		int menu = sc.nextInt();
		
		int change = 0;
		
		if(money>=1800 && menu==1) {
			change = money-1800;
			System.out.println("잔돈 : " + change + "원");
		}else if(money>=2000 && menu==2) {
			change = money-2000;
			System.out.println("잔돈 : " + change + "원");
		}else if(money>=1200 && menu==3) {
			change = money-1200;
			System.out.println("잔돈 : " + change + "원");
		}else {
			System.out.println("잔돈이 부족합니다");
		}
		//잔돈
		System.out.println("천원 : " + change/1000);
		System.out.println("오백원 : " + (change%1000)/500);
		System.out.println("백원 : " + ((change%1000)-500)/100);
		
		
		
			
		}
		
}		


