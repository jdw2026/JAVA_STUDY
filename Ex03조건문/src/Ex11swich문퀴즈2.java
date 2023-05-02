import java.util.Scanner;

public class Ex11swich문퀴즈2 {

	public static void main(String[] args) {
//		월(1~12)을 입력받아 해당 월이 봄,여름,가을,겨울 중
//		어느 계절인지 출력하시오.
//		(1,2,12월 -> 겨울 / 3,4,5월 -> 봄 /
//		6,7,8월 -> 여름 / 9/10/11월 -> 가을)
		
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("월(1~12) 입력 : ");
		int month = sc.nextInt();
		int winter = 1;
		
		//java 15이상부터는 case 1,2,3 : <-이렇게 쓰는거 가능
		switch(month) {
		case 12 :
		case 1 :
		case 2 :	
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3 :
		case 4 :
		case 5 :	
			System.out.println(month + "월은 봄입니다");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month + "월은 여름입니다");
			break;
		case 9 :
		case 10 :
		case 11:
			System.out.println(month + "월은 가을입니다");
		
		}
		

	}

}
