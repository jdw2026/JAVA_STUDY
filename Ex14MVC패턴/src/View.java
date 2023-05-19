import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		//View 역할 수행 : 사용자 인터페이스 (화면보여주기, 선택 기능)
		
		//재생, 정지, 다음곡, 이전곡, 종료
		Scanner sc = new Scanner(System.in);
		
		//컨트롤러 기능에 접근할 수 있도록 객체 생성
		Controller c = new Controller();

		
		int menu; //사용자가 선택한 메뉴
		
		System.out.println("d8b   db d88888b db   d8b   db    d88b d88888b  .d8b.  d8b   db .d8888. ");
		System.out.println("888o  88 88'     88   I8I   88    `8P' 88'     d8' `8b 888o  88 88'  YP ");
		System.out.println("88V8o 88 88ooooo 88   I8I   88     88  88ooooo 88ooo88 88V8o 88 `8bo.   ");
		System.out.println("88 V8o88 88~~~~~ Y8   I8I   88     88  88~~~~~ 88~~~88 88 V8o88   `Y8b. ");
		System.out.println("88  V888 88.     `8b d8'8b d8' db. 88  88.     88   88 88  V888 db   8D ");
		System.out.println("VP   V8P Y88888P  `8b8' `8d8'  Y8888P  Y88888P YP   YP VP   V8P `8888Y'");
		
		System.out.println();
		while(true) {
			System.out.print("[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5]종료 >> ");
			menu = sc.nextInt();
			
			if(menu==1) {
				c.play();
			}else if(menu==2) {
				c.stop();
			}else if(menu==3) {
				c.next();
			}else if(menu==4) {
				c.befor();
			}else{//menu==5
				c.stop();
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
		
	
	}

}
