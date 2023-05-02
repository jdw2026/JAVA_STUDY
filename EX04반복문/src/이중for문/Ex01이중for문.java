package 이중for문;

public class Ex01이중for문 {

	public static void main(String[] args) {
		
		//패키지를 구분하는 이유
        //하나의 프로젝트안에서 클래스 이름이 중복되도 된다. 협업을 위해		
		
		//이중for문을 사용해서 2단~9단까지
		//2단을 for문을 사용해서 출력
		//3단, 4단도
		
		
		 
//			for(int i=1; i<=9; i++) {
//				System.out.println("2*"+i+"="+2*i);
//			}
//			
//			for(int i=1; i<=9; i++) {
//				System.out.println("3*"+i+"="+3*i);
//			}
//			for(int i=1; i<=9; i++) {
//				System.out.println("4*"+i+"="+4*i);
//			}
//			
			for(int a=2; a<=9; a++) {
				System.out.print(a+"단 : ");
				for(int i=1; i<=9; i++) {
					System.out.print(a+"*"+i+"="+a*i+ " ");
				}
				System.out.println();
				
			}
		
			//지역변수 , 전역변수
			//지역변수 : 특정 영역(scope)에서만 사용할 수 있는 변수
			//전역변수 : 클래스 전체에서 사용할 수 있는 변수
			//특정영역을 구분하는 방법 {영역}

	}

}
