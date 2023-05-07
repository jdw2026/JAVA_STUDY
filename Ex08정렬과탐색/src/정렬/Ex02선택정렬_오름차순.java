package 정렬;

import java.util.Arrays;

public class Ex02선택정렬_오름차순 {

	public static void main(String[] args) {
		
		int[] arr = {98, 7, 70, 13, 24};
		
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
    
//		int temp;
//		//1회차
//		int index = 0;
//		for(int i=index+1; i<5; i++) {
//			if(arr[index]>arr[i]) {
//				index = i;	 //index 배열안에서 가장 작은 값이 존재하는 인덱스 번호를 기억
//			}
//		}
//		temp = arr[0];
//		arr[0] = arr[index]; //가장 작은 숫자 --> 0번으로
//		arr[index] = temp; //원래 0번에 있던값을 index로 옮기기!
//		
//		System.out.println(1+"회차 : "+Arrays.toString(arr));
//		
//		//2회차
//		index = 1;
//		for(int i=index+1; i<5; i++) {
//			if(arr[index]>arr[i]) {
//				index = i;  //두번째로 작은 숫자가 존재하는 인텍스 번호를 찾음
//			}	
//		}
//		temp = arr[1];
//		arr[1] = arr[index];
//		arr[index] = temp;
//		
//		System.out.println(2+"회차 : "+Arrays.toString(arr));

		
		int index;  //내가 지금까지 본 숫자중에 가장 작은 수의 인덱스 번호 기억
		int temp;  //치환시 사용
		for(int j=0; j<arr.length-1; j++) {
			index = j; //1회차-0, 2회차-1, 3회차-2, 4회사-3
			for(int i = index+1; i<arr.length; i++) {
				if(arr[index]>arr[i]) {
					index = i;  //두번째로 작은 숫자가 존재하는 인텍스 번호를 찾음
				}	
			}
			temp = arr[j]; //1회차-0, 2회차-1, 3회차-2, 4회사-3
			arr[j] = arr[index];
			arr[index] = temp;
			
			System.out.println(j+1+"회차 : "+Arrays.toString(arr));
			
		}
		
		
	}

}
