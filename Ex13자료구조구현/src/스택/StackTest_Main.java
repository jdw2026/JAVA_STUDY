package 스택;

import java.util.Scanner;

public class StackTest_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StackTest st = new StackTest(5);
		
		int menu;
		while(true) {
			System.out.print("[1]푸시 [2]팝 [3]피크 [4]덤프 [5]비우기 [6]위치 찾기 [7]데이터 개수 [8]종료 >> ");
			menu = sc.nextInt();
			if(menu==1) {//푸시
				System.out.print("푸쉬값 입력 : ");
				st.push(sc.nextInt());
				
			}else if(menu==2) {//팝
				
			}else if(menu==3) {//피크
				
			}else if(menu==4) {//덤프
				
			}else if(menu==5) {//비우기
				
			}else if(menu==6) {//위치 찾기
				
			}else if(menu==7) {//데이터 개수
				
			}else if(menu==8) {//종료
				System.out.println("종료합니다");
				break;
				
			}else {
				System.out.println("숫자를 다시 입력하세요");
			}
		
		
		}
			




	}

}
