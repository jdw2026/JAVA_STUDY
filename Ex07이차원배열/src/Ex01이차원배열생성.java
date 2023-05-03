
public class Ex01이차원배열생성 {

	public static void main(String[] args) {
		
		
		int[][] arr = new int[3][5];  //배열 생성시 크기 무조건 지정
		//일차원배열 3개 -> 5칸 (길이 5)
		//레퍼런스 배열 1개 -> 길이 3
		// -> 3행 5열 행렬 구조
		//int 형 배열 -> 초기화 하지 않으면 기본 0
		
		arr[0][0] = 10;
		//arr[0] = 1; //->레퍼런스 배열에 값을 넣을수는 없음. 레퍼런스 배열 초기화 불가능
		System.out.println(arr[0][0]);
		
		//배열 값을 알고있을때.
		char[][] chararr = {{'a','b','c'}, {'d','e','f'}};
		System.out.println(chararr.length);  //2가 나온다. 레퍼런스 배열의 길이를 의미
		 										// 일차원배열이 몇개? 2개
		System.out.println(chararr[0].length);//3이나옴. 일차원 배열의 길이를 의미
		
		
		
		//이차원배열 실습1
		int[][] arr2 = new int[5][5];
		
		int num=1;
		
		for(int j=0; j<5; j++) { // 바깥쪽 포문은 1차원 배열을 반복
			for(int i=0; i<5; i++) { //안쪽 반복문은 1차원배열 하나 초기화
				                     //1개의 행의 각(실제)데이터를 다룬다.
				arr2[j][i] = num++;
			}
		}
		
		for(int j=0; j<arr2.length; j++) { // 바깥쪽 포문은 1차원 배열을 반복
			for(int i=0; i<arr2[j].length; i++) { //안쪽 반복문은 1차원배열 하나 초기화
				System.out.print(arr2[j][i]+"\t ");  //\t -> 탭키를 의미. 떨어지는 공간 일정하게 하기위해
			}System.out.println();
		}

		
		
		System.out.println();
		
		
		//이차원배열 실습2
		//4행 6열 크기 2차원 배열, 21~출력
		int[][] arr3 = new int[4][6];
		
		int num2 =21;
		//이중포문은 제일 바깥에서부터 i -> j -> k
		for(int j=0; j<arr3.length; j++) {
			for(int i=0; i<arr3[j].length; i++) {
				arr3[j][i] = num2++;
			}
		}
		
		for(int j=0; j<arr3.length; j++) {
			for(int i=0; i<arr3[j].length; i++) {

				System.out.print(arr3[j][i]+"\t");
			}System.out.println();
		}
		
		
		System.out.println();
		
		//이차원배열 실습3
		int[][] arr5 = new int[5][5];
		int num3 = 25;
		
		for(int i = arr5.length-1;  i>=0; i--) {
			for(int j=0; j<arr5[i].length; j++) {
				arr5[i][j] = num3--; 
			}
		}
		
		for(int i=0; i<arr5.length; i++) {
			for(int j=0; j<arr5[i].length; j++) {

				System.out.print(arr5[i][j]+"\t");
			}System.out.println();
		}
		
		
		
		System.out.println();
		
		//실습3번 선생님풀이
		
//		int[][] arr0 = new int[5][5];
//		
//		int num0 = 1;
//		
//		for(int i=0; i<arr0.length; i++) {
//			for(int j=0; j<arr0[i].length; j++) {
//				arr[i][4-j] = num0++;
//			}
//		}
//		
//		for(int i=0; i<arr0.length; i++) {
//			for(int j=0; j<arr0[i].length; j++) {
//				System.out.println(arr0[i][j]+"\n");
//			}System.out.println();
//		}
//		
		System.out.println();

		
		//이차원배열 실습4
		
		int[][]arr6 = new int[5][5];
		
		int num4 = 1;
				
		for(int i=0; i<arr6.length; i++) {
			for(int j=0; j<arr6[i].length; j++) {
				
				
				if(i%2==0) {
					//순방향 - 0,2,4
					arr[i][j] = num4++;
				}else {
					//역방향 - 1,3
					arr[i][4-j] = num++;
				}
			}
		}
		
		for(int i=0; i<arr6.length; i++) {
			for(int j=0; j<arr6[i].length; i++) {
				System.out.println(arr[i][j]+"\n");
			}System.out.println();
		}
		
		

	}

}
