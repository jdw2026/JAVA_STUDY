package 큐;

import java.util.Scanner;

public class IntQueueTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IntQueue s = new IntQueue(30);
		
		
		int menu;
		while(true) {
			System.out.print("[1]인큐 [2]디큐 [3]피크 [4]덤프 [5]비우기 [6]위치 찾기 [7]데이터 개수 [8]종료 >> ");
			menu = sc.nextInt();
			if(menu==1) {
				System.out.print("인큐할 값 입력 : ");
				int num = sc.nextInt();
				s.enque(num);
			}else if(menu==2) {
				System.out.println("제거 된 값 : "+s.deque());
				
			}else if(menu==3) {
				
			}else if(menu==4) {
				
			}else if(menu==5) {
				
			}else if(menu==6) {
				
			}else if(menu==7) {
				System.out.println("데이터 개수 : "+s.size());
				
			}else if(menu==8) {
				
			}
			
		}
			
		

	}

}
