import java.util.Scanner;

public class Ex08_While_5_2 {

	public static void main(String[] args) {
		
//		2. 로그인이 실패했을 경우에는 계속 해서
//		아이디와 비밀번호를 입력하고 로그인이 성
//		공하면 프로그램을 종료하시오.
		
		
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
		}else {
			System.out.println("로그인 실패");
		}
        }
		

	}

}
