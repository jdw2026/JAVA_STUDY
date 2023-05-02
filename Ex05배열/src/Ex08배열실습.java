import java.util.Scanner;

public class Ex08배열실습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
//		String[] id_array = new String[3];
//		String[] pw_array = new String[3];
//		
//		int a = 0; //가입한 사람 누적 변수
//		int b = 0; //아이디 비번 입력 누적 변수
// 		
//		while(true) {
//			System.out.println("1.회원가입 2.로그인 3.종료");
//			int num = sc.nextInt();
//			if(num==1) {
//				if(a<3) {	
//					System.out.println("===회원가입===");
//					System.out.print("id 입력 : ");
//					id_array[a] = sc.next();
//					System.out.print("pw 입력 : ");
//					pw_array[a] = sc.next();
//					a++;
//				}
//			
//				
//			}else if(num==2) {
//				System.out.println("===로그인===");
//				System.out.print("id 입력 : ");
//				String id = sc.next();
//				System.out.print("pw 입력 : ");
//				String pw = sc.next();
//				
//				
//				for(int i=0; i<3; i++) {
//					if(id.equals(id_array[i]) && pw.equals(pw_array[i])) { // ==안먹힘 스트링.
//						System.out.println("로그인 성공!");
//						break;
//					}else {
//						System.out.println("로그인 실패");
//					}
//				}
//				
//				
//				
//			}else {
//				System.out.println("프로그램을 종료합니다");
//				break;
//			}
//		}
		
		
		
		
		//선생님 풀이
		
		int menu; //공간을 반복해서 안만들고 한번만 만들기 위해 와일문 밖에서 만듬.
		String id; //회원가입할때마다 새로운 공간을 계속 만드는것을 예방하기 위해. 공간 하나만 만들기 위해
		String pw;//현재 회원가입하는 사용자의 비밀번호 저장.
		
		String[] idarray = new String[3]; //사용자의 저오들을 저장할 배열.
		String[] pwarray = new String[3];
		
		int cnt = 0; //현재까지 회원가입한 사용자의 카운팅 변수
		boolean sw = true; //트루는 로그인 불가능. 펄스는 로그인 가능.
		
		
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			 menu = sc.nextInt(); //변수 선언(공간을 만든다)
			 
			 
//			 System.out.print("아이디 : ");    //아이디랑 비번 배열에 잘 들어갔는지 확인하기위해 
//			 for(String i : idarray) {
//				 System.out.print(i+" ");
//			 }
//			 System.out.print("비밀번호 : ");
//			 for(String p  : pwarray) {
//				 System.out.print(p+" ");
//			 }
//			 System.out.println();
			 
			 if(menu==1) {//회원가입
				 System.out.println("==회원가입==");
				 
				 if(cnt==3) {
					 System.out.println("회원가입 물가!");
				 }else {
					 System.out.print("ID : ");
					 idarray[cnt] = sc.next();
					 System.out.print("PW : ");
					 pwarray[cnt] = sc.next();
					 
					 //[가입할때마다 변해야함 -> 변수를 사용해야함]
//					 idarray[cnt] = id;  한번에 받기위해. 위에로 이동
//					 pwarray[cnt] = pw;
					 cnt++;// 그다음 회원가입 하는 사람은 그 다음 인덱스에 저장되게 하는것.
					 
				 }
				 
				
			 }else if(menu==2) { //로그인
				 System.out.println("로그인");
				 System.out.print("ID : ");
				 id = sc.next();
				 System.out.print("PW : ");
				 pw = sc.next();
				 
				 
				 for(int i=0; i<cnt; i++) { //cnt를 쓰는 이유는 두명만 가입하고 로그인하려하면 인덱스2번 배열은 null값이 들어가서 오류가남. null은 비교가 안됨.
					 if(idarray[i].equals(id) && pwarray[i].equals(pw)) {
						 System.out.println("로그인 성공!");
						 sw = false;
						 break; //성공해도 다른거까지 확인하는것은 비효율적이기 때문에 성공하는 순간 브레이크로 나가기.
					 
					 }
				 
				 }if(sw) {
					 System.out.println("로그인 실패!");
				 }
	
			 }else { //종료
				 System.out.println("종료");
				 break;
			 }
			
	
		}

	}

}
