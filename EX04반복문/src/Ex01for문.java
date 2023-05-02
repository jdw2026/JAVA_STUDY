
public class Ex01for문 {

	public static void main(String[] args) {
		
		
		//for문을 사용해서 21~57까지 출력
			
		for(int i=21; i<=57; i++) { 
			System.out.print(i+" ");
		}
		
		
		//2. for문을 이용하여 96~ 53 까지
		
		for(int i=96; i>=53; i--) {
			System.out.print(i+ " ");
		}
		
		
		//3. 21에서 57까지의 수중 홀수만 출력하시오.
		
		for(int i=21; i<=57; i+=2 ) {
			System.out.println(i);
		}
		
		
		//선생님 풀이
		//3-1 시작점21 도착점57  보폭 +2
		
		for(int i=21; i<=57; i+=2) {
			System.out.println(i);
		}
		
		//3-2 판단(조건식)
		//21 - 57 판단
//		if(21 % 2 == 1) {
//			System.out.println(21);
//		}
//		
//		if(22 % 2 == 1) {
//			System.out.println(22);
//		}
//		
//		if(23 % 2 == 1) {
//			System.out.println(23);
//		}
//		
		
		//반복되는 코드들을 지우고
		for(int i=21; i<=57; i++) {
			if(i % 2 ==1) {
				System.out.println(i);
			}
		}
		
		
		

	}

}
