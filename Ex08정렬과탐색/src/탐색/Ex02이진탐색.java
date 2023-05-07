package 탐색;

public class Ex02이진탐색 {

	public static void main(String[] args) {
		
		//이진 탐색
		// : 변수 3개를 사용해서 데이터를 탐색
		// lowIndex , highIndex, middlIndex
		// 장점 : 시간복잡도가 1/2로 빠른 탐색 속도를 가지고 있음
		// 단점 : 검색 알고리즘 상 정렬된 리스트에서만 사용 가능
		
		//정렬된 배열 선언 및 초기화
		int[] arr = {1, 7, 16, 25, 30, 33, 41, 66, 78, 90};
		
		// 최소 인덱스 값
		int lowIndex = 0;
		
		// 최고 인덱스 값
		int highIndex = arr.length-1;
		
		//내가 찾고 싶은 숫자를 하나 정해주자
		int num = 66;
		
		while(true) {
			// middleIndex 초기화
			int middleIndex = (lowIndex + highIndex)/2;
			//현재 보고 있는 배열 구역의 센터 인덱스값을 초기화
			
			if(arr[middleIndex] == num) {
				System.out.println(middleIndex);
				break;
			}else {
				//arr[m] != num
				//arr[m] 보다 작은지 큰지를 판단한 다음 
				//로우 인덱스값과 하이인덱스 값을 다시 설정
				if(arr[middleIndex]>num) {
					highIndex = middleIndex-1;
				}else {//arr[middleIndex]<num
					lowIndex = middleIndex+1;
				}
			}
			
		}
		
		
		
		
	}

}
