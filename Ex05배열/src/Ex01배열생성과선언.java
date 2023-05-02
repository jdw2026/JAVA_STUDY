
public class Ex01배열생성과선언 {

	public static void main(String[] args) {
		
		//1. 배열 생성 + 배열의 크기를 적어야함(메모리에 몇개의 연속된 공간을 할당 해줄것인지)
		//new int[5]; //이렇게만 쓰면 생성은 되는데 쓸수가 없다. 왜냐면 레퍼런스 변수가 없어서
		
		int[] arr = new int[5]; //레퍼런스 변수까지 선언해야지만 배열값에 접근 가능.
		
		//다른방법
		int arr2[] = new int[3]; //자료형 뒤에 대괄호를 쓰거나 변수명 뒤에 쓰거나 두가지 방법 가능
		                         // 하지만 자료형 뒤에 []대괄호를 쓰는게 좋음. 바로 배열의 주소값이구나 알수있게
		
		//2. 배열에 값 저장
		arr[0] = 10; //arr이 가리키고 있는 배열의 0번 인덱스에 값을 할당.
		arr[1] = 20; //1번 인덱스에 값 할당
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		//arr[5] = 60; // 실행전 빨간색(컴파일)오류가 안나는 이유 프로그램을 실행하기 전까지는 arr의 크기를 알수 없음
		             //동적로딩의 특징떄문임.(new int[5] 실행하기 전까지는 크기를 알 수 없음)
		
		//3.배열에 저장된 값 출력하기
		System.out.println(arr[2]);
		
		//4. 0~4번까지 모든 값 출력하기
		System.out.println(arr); //[I@6504e3b2 이게 나오는데 이건 배열의 참조값(heap 영역에 저장된 배열에 찾아갈떄) 말그대로 주소임.
		//참조값을 저장하고 있는 변수 -> 레퍼런스 변수라고 부른다.
		
		
		System.out.println(arr.length); //arr의 길이를 알려주는것. 활용은? 아래 포문에서 4를 legnth로 바꿀수 있음
		
		
		for(int i=0; i<=arr.length; i++) { //모든 값을 출력할때 반복문을 사용하면 편하다.
			System.out.println(arr[i]);
		}
		
		
		//5. 배열에 저장되어야 하는 값을 이미 알고 있을때 한번에 저장하는 방법
		int[] arr3 = {4,6,2,56,20};
		// 정수형 데이터가 저장될 수 있는 5칸짜리 배열 생성하고 초기화!
		System.out.println(arr3[0]); //arr3 배열변수에 들어있는 0번째 값 출력하기
		
		//int[] intArray -> 배열이 아니고 배열의 참조값을 저장하는 변수이다.
		int[] intArray = new int[5];
		int[] myArray = intArray;
		//intArray 와 myArray 가 똑같은 배열을 가리키고 있다.
		
		intArray[1] = 2;
		System.out.println(intArray[1]);
		myArray[1] = 6;
		System.out.println(intArray[1]);
		
		

	}

}
