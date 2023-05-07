package 탐색;

import java.util.Arrays;

public class Ex03이진탐색 {

	public static void main(String[] args) {
		
//		다음 배열에서 숫자 68이 몇번째 인덱스에 저장되어있는지 출력하시오.
		
		int[] arr = {10,24,7,68,42,82,3,43,22,84};
		
		//선생님 풀이
		//선택 오름차순
		//1. 치환
		int temp;
		//2. 가장 작은 값을 가진 인덱스의 값이 저장될 변수
		int index;
		
		for(int i=0; i<arr.length-1; i++) {
			
			index = i;
			for(int j=i; j<arr.length; j++) {
				if(arr[index]>arr[j]) {
					index = j;
				}
			}
			//치환
			//제일 작은 값을 0번인덱스로.. 두번째 작은건 1번인덱스로.
			if(i != index) {
				//원래 숫자의 자리와 제일 작은 숫자가 저장된 자리가 다를때만 치환
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp; //0번 인덱스에 가장 작은값이 들어온 상태 
			}	
		}
		//이진탐색 : 배열에 있는 데이터가 꼭 정렬이 되어있어야 한다.
		int num = 68;
		
		int low = 0;
		int high = arr.length-1;
		
		while(true) {
			int middle = (low+high)/2;
			//1.미들에 있는 데이터랑 넘이랑 같은지 판단
			if(arr[middle] == num) {
				System.out.println(middle);
				break;
			}else {
				//미들에 있는 값보다 큰지? 판단해서 로우와 하이 값을 재설정
				if(arr[middle] > num) {
					high = middle-1;
				}else {
					low = middle+1;
				}
			}
		}
		
		
		
		
		
		
		
		
		
	
		
//		int temp;
//		
//		
//		for(int j=0; j<arr.length-1; j++) {
//			
//			boolean sw = true;
//			for(int i=0; i<arr.length-1; i++) {
//				
//				if(arr[i]>arr[i+1]) {
//					temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;
//					sw = false;
//					
//				}
//			}
//			if(sw==true) {
//				break;
//			}
//			
//			System.out.println(Arrays.toString(arr));
//		}
//		
		
		

	}

}
