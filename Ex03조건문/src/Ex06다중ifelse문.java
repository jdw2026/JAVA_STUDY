import java.util.Scanner;

public class Ex06다중ifelse문 {

	public static void main(String[] args) {
		
//		정수형 변수 score를 선언하고 키보드로 값을 입력받은 후 값을 할당하시오.
//		입력받은 값이 90점 이상이면 “A학점입니다”, 80점 이상 90점 미만인 경우는
//		“B학점입니다”, 70점 이상 80점 미만인 경우는 “C학점입니다”를 출력하고
//		70점 미만인 경우는 “F학점입니다”를 출력하시오.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		if(score>=90) { // 90미만인 점수는 다 걸러줌
			System.out.println("A");
		}else if(score>=80) {//<-여기서 다시 90미만인지 물어볼 필요 없음
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else{
			System.out.println("F");
		}

	}

}
