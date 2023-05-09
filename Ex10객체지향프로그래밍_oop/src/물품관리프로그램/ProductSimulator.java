package 물품관리프로그램;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product pr = new Product();
		//product 자료형을 관리하는 ArrayList 만들기
		ArrayList<Product> arr = new ArrayList<Product>();
		

		
		while(true) {
			System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >> ");
			int choice = sc.nextInt();
			if(choice==1) {
				System.out.print("물건 이름 : ");
				String name=sc.next();
				System.out.print("단가 : ");
				int price=sc.nextInt();
				System.out.print("수량 : ");
				int amount=sc.nextInt(); 
				
				//product (설계도, 자료형)
				//1. 사용자한테 입력받은 name, price,amount 를 product 자료형으로 묶어주자
				Product p = new Product(name, price, amount);
				//2.arr.add()
				arr.add(p);
			}else if(choice==2){
				//예상 판매량 조회
				//arr 안에 있는 데이터들을 다 확인(출력)
				System.out.println("제품명    단가    수량    ");
				for(int i=0; i<arr.size(); i++) {
					System.out.println(arr.get(i).getName() + " " 
				                      +arr.get(i).getUnitPrice()+" "
				                      +arr.get(i).getAmount());
					//arr.get(0).getName(); //arr 0번의 네임.
				}
				//판매 시 전체 매출
				//가격 * 수량 + 가격* 수량
				int sum=0;
				for(int i=0; i<arr.size(); i++){
					sum += (arr.get(i).getUnitPrice()*arr.get(i).getAmount());
				}
				System.out.println("판매시 매출 : "+sum);
				
				
				
			  
			}else if(choice==3) {
				System.out.println("프로그램 종료");
				break;
				
			}else {
				System.out.println("숫자를 다시 입력하세요");
			}
		
		
		
		
		

	}

}

}