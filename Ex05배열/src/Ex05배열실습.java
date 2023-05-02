import java.util.Scanner;

public class Ex05배열실습 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//1. 크기가 5인 정수형 데이터를 저장할 수 있는 배열 생성
		// -> 그 배열의 참조값(주소값)을 저장할 레퍼런스 변수 선언하기
		int[] score = new int[5]; // ->여기까지는 0으로 초기화된 배열임
		

		
		for(int i=0; i<score.length; i++) {
			//2. 정수형 배열에 5개의 점수를 입력과 그 값 저장.
			System.out.print((i+1)+"번째 입력>> ");
			 score[i] = sc.nextInt();
			
//			 System.out.print(i+"번째 입력>> ");
//			 score[1] = sc.nextInt();
//			 
//			 System.out.print(i+"번째 입력>> ");
//			 score[2] = sc.nextInt();
//			 
//			 System.out.print(i+"번째 입력>> ");
//			 score[3] = sc.nextInt();
			 
			 }
			System.out.print("입력된 점수 : ");
			//일반 for 문
			for(int i=0; i<score.length; i++) {
				System.out.print(score[i] + " ");
			}
			
			//확장 for문(for~each 문)   /  위에 포문을 밑에처럼도 가능
			// : 배열, List 구조에서 쓰일 수 있는 반복문.
			//for(배열의 0번 인덱스에 있는 값부터 임시로 저장할 변수 :배열의 레퍼런스 변수 이름) 
			//-> 여기서는 a라는 변수에 score에 0번 인덱스의 값을 a로 쓸수있다.
//			for(int a:score) {
//				System.out.print(a + " ");
//			}
			
			int max = score[0];//내가 지금까지 본 점수중에 최고점수 저장할 변수
			int min = score[0];//내가 지금까지 본 점수중에 최저점수 저장할 변수
			int sum = 0; //누적합 저장할 변수
			
			
			for(int a:score) {
				sum += a; //누적합을 계속 더해서 sum 에 넣기
				 
				if(max<a) { //최고 점수 구하기
					max = a;
				}
				if(min>a) {//최저 점수 구하기
					min = a;
				}
			}
			System.out.println("\n최고점수 : " + max );
			System.out.println("최저점수 : " + min );
			System.out.println("총합 : " + sum );
			System.out.printf("평균 : %.2f" , sum/(double)score.length);
	}

}
