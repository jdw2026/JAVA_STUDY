import java.util.Scanner;

public class Ex06배열실습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//크기가 8인 배열을 생성하고 이름으로 값을 초기화 하여 프로그램 실행시 이름을 입력하고 해당이름이 몇번쨰
		//인덱스에 저장되어 있는지 출력하시오.
		
		//이 배열안에 들어있는 값이 중복되지 않는다(가정)
		String[] arrStr = {"김지은", "박수현", "정세연", "이명훈", "강예진", "임명진", "정형", "채수민"};
		
		//1.출력 --> 검색할 이름 입력
		System.out.print("검색할 이름 입력>> ");
		String name = sc.next(); //입력된 이름 저장할 변수 생성
		
		
		for(int i=0; i<arrStr.length; i++) {//0번 인덱스부터 인덱스 길이까지 1씩 증가하기 반복.
			// == : 기본타입 비교시에만 사용
			if(name.equals(arrStr[i])) {//입력받은 이름이 arrStr[i] 배열중에 같은게 있냐?
				System.out.println(name+"님은 "+i+"번쨰 인덱스에 저장되어 있습니다");
				break; //가장 가까운 반복문 나가는 키워드! 브레이크가 없으면 맞아도 다음것도 계속 확인하니까...
			}
		}
		
		//밑에는 같은 내용인데 for~each 문으로 한거 
//			int i =0;
//		for(String a:arrStr) {
//			if(name.equals(a)) {
//				
//				System.out.println(name+"님은 "+i+"번쨰 인덱스에 저장되어 있습니다");
//			}i++;
//		}
			
			
		}



}
