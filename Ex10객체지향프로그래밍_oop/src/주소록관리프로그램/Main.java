package 주소록관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Address 자료형(클래스)를 관리하는 ArrayList 생성
		ArrayList<Address> arr = new ArrayList<Address>();
		
		while(true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int choice = sc.nextInt();
			if(choice==1) { //연락처 추가
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();
				
				Address ad = new Address(name, age, phoneNumber);
				arr.add(ad);
				
			}else if(choice==2) {//연락처 전체조회
				
				if(arr.size()>0) {
					list(arr);
//					for(int i=0; i<arr.size(); i++) {
//						System.out.println(i+1+". "+arr.get(i).getName()+
//								           "("+arr.get(i).getAge()+"세) : "+
//								            arr.get(i).getPhoneNumber());
//					}
					
				}else {
					System.out.println("등록된 연락처가 없습니다.");
				}
				
			}else if(choice==3) {//연락처 삭제
				if(arr.size()>0) {
					list(arr);
//					for(int i=0; i<arr.size(); i++) {
//						System.out.println(i+1+". "+arr.get(i).getName()+
//								           "("+arr.get(i).getAge()+"세) : "+
//								            arr.get(i).getPhoneNumber());
//					}
					
				}else {
					System.out.println("등록된 연락처가 없습니다.");
				}
				System.out.print("삭제할 번호 입력 : ");
				arr.remove(sc.nextInt()-1);
				
				
			}else if(choice==4) {//연락처 검색
				System.out.print("검색할 이름 입력 : ");
				String name2 = sc.next();
				
				//검색하고자 하는 데이터의 위치를 저장하는 변수
				int index = -1;
				
				//입력한 이름이 있는지 없는지 판단.
				for(int i=0; i<arr.size(); i++) {
					if(name2.equals(arr.get(i).getName())) {
						index = i;
					}
                   }
				 // index라는 변수에 어떤값이 들어있는지 판단
				if(index==-1) {
					System.out.println("검색한 이름의 정보가 없습니다.");
				}else {
					System.out.println(index+1+". "+arr.get(index).getName()+
					           "("+arr.get(index).getAge()+"세) : "+
					            arr.get(index).getPhoneNumber());
				}	
			
			
			
		}else if(choice==5){//프로그램 종료
			System.out.println("프로그램 종료");
			break;
		}else {
			System.out.println("번호를 다시 입력하세요");
		}
		
		
		

	
		}
	
		
	

  }
	
	public static void list(ArrayList<Address> arr) {
		for(int i=0; i<arr.size(); i++) {
			System.out.println(i+1+". "+arr.get(i).getName()+
					           "("+arr.get(i).getAge()+"세) : "+
					            arr.get(i).getPhoneNumber());
		}
	}
		
	

	
	
	
	
}
