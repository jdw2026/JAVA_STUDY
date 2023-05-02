import java.util.Scanner;

public class Ex08_While_5_3 {

	public static void main(String[] args) {
		
//		3. 아이디나 비밀번호가 틀렸을 경우 “계속
//		하시겠습니까?”라는 문장을 출력하고 사
//		용자가 “Y”를 입력하면 입력을 계속하고
//		“N”을 입력하면 입력을 중단하시오.
		
        Scanner sc = new Scanner(System.in);
		
        while(true) {
		//1.출력 아이디 :
		System.out.print("아이디 : ");
		//2.입력 
		String id = sc.next();
		//3.출력 비밀번호 :
		System.out.print("비밀번호 : ");
		//4.입력
		int pw = sc.nextInt();
		//5.아이디와 비밀번호가 맞으면 로그인 성공 프로그램 종료
		// 로그인 실패시 로그인 실패 출력후 계속해서 아이디와 비밀번호 입력.
		if(id.equals("smhrd") && pw==1234) {
			System.out.println("로그인 성공");
			break;
		}else {//틀렸을때 계속하시겠습니까? 문장 출력하고 사용자 y 입력하면 계속 , n입력하면 중단
			System.out.println("로그인 실패");
			System.out.print("계속 하시겠습니까?");
			String answer = sc.next();
			if(answer.equals("N")) {
				break;
			}
		}
        }
		
		

	}

}
