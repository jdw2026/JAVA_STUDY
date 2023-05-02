import java.util.Arrays;

public class Ex02배열 {

	public static void main(String[] args) {
		
		//1. 정수형 데이터 저장하는 배열의 참조값을 가지는 레퍼런스 변수 먼저 선언
		int[] array;  //배열 생성안함. 
		
		//2. 크기가 10인 배열 생성 후 참조값을 변수에 저장
		array = new int[10]; //참조값을 어레이에 넣겠다.
		
		//3. 0~9번 인덱스에 값 초기화(할당)
		array[0] = 20;
		array[1] = 5;
		array[2] = 420;
		array[3] = 5;
		array[4] = 2;
		array[5] = 7;
		array[6] = 12;
		array[7] = 82;
		array[8] = 4;
		array[9] = 31;
		
		//4. 배열의 모든 값 출력
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
			
		}
		
		//Arrays - 모든 배열들을 다룰수 있는 도구
		//도구 -> 객체(인스턴스)
		//toString(객체가 가지고 있는 공통 기능)
		// : 객체가 가지고 있는 값을 문자열로 바꿔주는 기능
		//array가 가르키는 값을 문자열로 바꿔준다.(밑에 코드 해석)
		//toString 반환타입은 String
		System.out.println(Arrays.toString(array)); 
		
		
		//5. 1번 인덱스에 저장된 값과 4번 인덱스에 저장된 값의 합을 출력
		System.out.println(array[1] + array[4]); //숫자연산 할때는 어떤 연산자든지 사용가능.
		
		//6. 각 인덱스에 저장된 모든 값을 더하여 출력
		//System.out.println(array[1] + array[2]+array[3] + array[4]...);
		
		//누적합
		int sum=0;//누적합을 저장하는 변수
		for(int i=0; i<array.length; i++) {
			//sum = sum +array[i];
			sum += array[i];
		}
		System.out.println(sum);
		
		//7. 배열안에 있는 수의 평균 구하여 출력
	    System.out.println(sum/array.length);
	    //System.out.println(sum/(double)array.length); 실수형으로 보고싶을때 방법
	    

	}

}
