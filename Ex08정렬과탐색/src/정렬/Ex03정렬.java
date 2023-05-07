package 정렬;

import java.util.Arrays;

public class Ex03정렬 {

	public static void main(String[] args) {
		
		int[] arr = {10, 24, 7, 68, 42, 82, 3, 43};
		
		//Arrays : 배열을 다룰 수 있는 속성, 메서드의 모음 -> 클래스 , 클래스를 사용하면->객체(도구)
		Arrays.sort(arr); //arr 배열안에 값을 오름차순으로 정렬해서 저장 
		                  // 출력은 안됨. 반환값이 없음
		
		System.out.println(Arrays.toString(arr));
	
		
	}

}
