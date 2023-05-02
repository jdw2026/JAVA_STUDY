import java.util.Scanner;

public class Ex08_While_5_4 {

	public static void main(String[] args) {
		
//		4. 아이디/비밀번호 입력을 3번 이상 틀렸
//		을 때 “본인인증을 해주세요” 문구를 출력
//		하고 프로그램을 종료하시오.
		
        Scanner sc = new Scanner(System.in);
		
        int a = 0;
        
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
			   //3번이상 틀리면 본인인증 해주세요 문구 출력하고 프로그램 종료.
			++a;
			if(a==3) {
				System.out.println("로그인 실패! 본인인증 해주세요");
				break;
			}
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
