import java.util.ArrayList;
import java.util.Scanner;

public class Ex03MusicList {

	public static void main(String[] args) {
		
		ArrayList<String> musicList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
			int num =  sc.nextInt();
			if(num==1) {
				System.out.println("========== 현재 재생 목록 ==========");
				if(musicList.size()==0) {
					System.out.println("재생 목록이 없습니다.");
				}else {
					for(int i=0; i<musicList.size(); i++) {
						System.out.println((i+1)+"."+musicList.get(i));
					}
				}
				System.out.println("================================");
				System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
				int num2 = sc.nextInt();
				if(num2==1) {//마지막위치에 추가
					System.out.print("추가 할 노래 입력 : ");
					String songName = sc.next();
					musicList.add(songName);
					System.out.println("추가가 완료되었습니다.\n");
				}else {//원하는 위치에 추가
					System.out.print("추가 할 노래 입력 : ");
					String songName2 = sc.next();
					System.out.print("추가 할 위치 입력 : ");
					int num3 = sc.nextInt();
					musicList.add(num3-1, songName2);
					System.out.println("추가가 완료되었습니다.\n");
				}
			}else if(num==2) {
				System.out.println("========== 현재 재생 목록 ==========");
				if(musicList.size()==0) {
					System.out.println("재생 목록이 없습니다.");
				}else {
					for(int i=0; i<musicList.size(); i++) {
						System.out.println((i+1)+"."+musicList.get(i));
					}
				}
				System.out.println("================================");
				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				int num4 = sc.nextInt();
				if(num4==1) {
					System.out.print("삭제할 노래 선택 >> ");
					int num5 = sc.nextInt();
					musicList.remove(num5-1);
					System.out.println("노래가 삭제되었습니다.");
				}else {
					musicList.clear();
					System.out.println("전체list가 삭제되었습니다.");
				}
				
				
			}else {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
		}
		
		
		
		
		
	}

}
