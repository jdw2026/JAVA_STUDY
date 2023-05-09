import java.util.ArrayList;
import java.util.Scanner;

public class Ex03선생님풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//재생목록
		ArrayList<String> musicList = new ArrayList<String>();
		int menu; //사용자가 선택한 메뉴를 저장(1~3중에 하나..)
		
		
		while(true) {
			System.out.println("[1]노래추가 [2]노래삭제 [3]종료 >> ");
			menu = sc.nextInt();
			
			if(menu==1) {
				printList(musicList);
//				System.out.println("========== 현재 재생 목록 ==========");  중복코드는 메서드로 만들기
//				if(musicList.size()==0) {
//					System.out.println("재생 목록이 없습니다.");
//				}else {
//					for(int i=0; i<musicList.size(); i++) {
//						System.out.println((i+1)+"."+musicList.get(i));
//					}
//				}
//				System.out.println("================================");
				System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
				menu = sc.nextInt(); //1~2번 저장
				if(menu==1) {
					System.out.print("추가 할 노래 입력 : ");
					sc.nextLine(); // 엔터키(공백문자)처리 ---버퍼를 비워버리는거임.
					musicList.add(sc.nextLine()); //변수 따로 안만들고 바로 넣어도됨.
					//next는 공백문자를 기준으로 앞에만 받아들임.
					//공백 뒤에는 버퍼에 저장되어있다가 다음 출력때 먼저 출력됨...
					//음악 제목에 띄어쓰기 있을경우...
					//nextLine 은 입력도 안됐는데 바로 넘어가버림. 완료로...
					// 그이유는 원하는 위치에 추가에 숫자 입력하고 엔터키 누름
					// 그 엔터키의 공백을 받아들인것임. 
					//그럼 위에 한번더 호출하기. 추가할 노래 입력 바로 밑에다가..
				}else {//menu==2
					System.out.print("추가 할 노래 입력 : ");
					sc.nextLine();
					String music = sc.next();  //이번에는 입력이 2개라서 변수에 저장해서 하기.
					System.out.print("추가 할 위치 입력 : ");
					int index = sc.nextInt();
					musicList.add(index-1, music);
				}
				System.out.println("추가가 완료되었습니다.\n");
			}else if(menu==2) {
				printList(musicList);
//				System.out.println("========== 현재 재생 목록 =========="); 중복코드는 메서드로
//				if(musicList.size()==0) {
//					System.out.println("재생 목록이 없습니다.");
//				}else {
//					for(int i=0; i<musicList.size(); i++) {
//						System.out.println((i+1)+"."+musicList.get(i));
//					}
//				}
				System.out.println("================================");
				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				menu = sc.nextInt();
				if(menu==1) {
					System.out.print("삭제할 노래 선택 >> ");
					musicList.remove(sc.nextInt()-1); //변수 따로 안만들고 바로 넣어도됨.
					System.out.println("노래가 삭제되었습니다.");
				}else {//menu==2
					musicList.clear();
					System.out.println("전체list가 삭제되었습니다.");
				}
				
			}else {//menu==3
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}//main 끝
	
	public static void printList(ArrayList<String> musicList) {
		System.out.println("========== 현재 재생 목록 ==========");  
		if(musicList.size()==0) {
			System.out.println("재생 목록이 없습니다.");
		}else {
			for(int i=0; i<musicList.size(); i++) {
				System.out.println((i+1)+"."+musicList.get(i));
			}
		}
		System.out.println("================================");
	}
	
	
	
	

}
