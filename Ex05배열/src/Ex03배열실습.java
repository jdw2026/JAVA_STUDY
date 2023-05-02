
public class Ex03배열실습 {

	public static void main(String[] args) {
		
		//1. 크기가 10인 배열 생성 원하는 값으로 초기화
		//{} 써서 배열 생성하기
		
		int[] array = {1,5,12,35,23,4,45,6,4,3};
		
		//2. 배열의 값 중 홀수만 출력, 홀수가 몇개인지
		
		int sum = 0; //홀수 갯수 저장하는 변수
		System.out.print("배열 홀수 : ");
		
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==1) {
				System.out.print(array[i] + " ");
				sum++;
			}
		}
		
		System.out.println("\n총 개수 : " + sum + "개");
		
		
		
		//선생님 풀이
//		
//		System.out.print("배열 혹수 : ");
//		int cnt = 0;//홀수 개수 카운팅 변수
//		for(int i = 0; i<array.length; i++) {
//			if(array[i]%2==1) {
//				System.out.print(array[i]+" ");
//				cnt++;
//			}
//			
//		}
//		System.out.println("\n총 개수 : "+cnt);
//		

	}

}
