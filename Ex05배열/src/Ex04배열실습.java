import java.util.Random;

public class Ex04배열실습 {

	public static void main(String[] args) {
		
		//랜덤 객체
		//레퍼런스 변수
		Random rd = new Random();
		
		
		//배열을 랜덤값 초기화
		int[] arr = new int[10];
		
		int a=21; //최소값 저장
		int b=0; //최대값 저장
		
		//0~9 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(20)+1;
			System.out.print(arr[i]+" ");
			if(arr[i]<a) {//최소값 받아서 저장하기
				a = arr[i];
			}
			if(arr[i]>b) {//최대값 받아서 저장하기
				b = arr[i];
			}
		}
		System.out.println("\n가장 큰 값 : " + b + "\n가장 작은 값 : "+a);
		
		
		//모두 랜던값으로 초기화, 기중 가장 큰값과 가장 작은 값 출력.
		
		
		//선생님 풀이////////////////////////////////////////////////////
//		int[] arr = new int[10];
//		//정수 배열을 선언 기본값 0
//		
//		System.out.println(arr[0]);
//		arr[0] = rd.nextInt(20)+1;
//		System.out.println(arr[0]);
//		
//		int max = arr[0]; //내가 지금까지 본 숫자중에 가장 큰 숫자를 저장
//		int min = arr[0]; //내가 지금까지 본 숫자중에 가장 작은 숫자를 저장
//		
//		///배열 초기화
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = rd.nextInt(20)+1;
//		}
//	
//		
//		int max = arr[0]; //내가 지금까지 본 숫자중에 가장 큰 숫자를 저장
//		int min = arr[0]; //내가 지금까지 본 숫자중에 가장 작은 숫자를 저장
//		
//		
//		//최대갑
//		for(int i=0; i<arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
//		//최소값
//		for(int i=0; i<arr.length; i++) {
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println(min);
		

	}

}
