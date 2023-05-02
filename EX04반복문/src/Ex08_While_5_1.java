import java.util.Scanner;

public class Ex08_While_5_1 {

	public static void main(String[] args) {
		
		
//		1. 아이디와 비밀번호를 각각 입력받고 아
//		이디가 “smhrd”이고 비밀번호가 “1234”인
//		경우 “로그인 성공” 문구를 출력하고 하나
//		라도 틀린 경우에는 “로그인 실패”를 출력
//		하시오.
		
		
		
		Scanner sc = new Scanner(System.in);
		
		//1.출력 아이디 :
		System.out.print("아이디 : ");
		//2.입력 
		String id = sc.next();
		//3.출력 비밀번호 :
		System.out.print("비밀번호 : ");
		//4.입력
		int pw = sc.nextInt();
		//5.아이디와 비밀번호가 맞으면 로그인 성공 출력 / 하나라도 틀리면 로그인 실패 출력
		if(id.equals("smhrd") && pw==1234) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		

	}

}
