import java.util.Scanner;

public class Ex03if문퀴즈2 {

	public static void main(String[] args) {
		// JAVA, Python, Android 점수를 각각 입력받은 후 평균이
		//80점 보다 높으면 “합격＂을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : ");
		int jaScore = sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int pyScore = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int andScore = sc.nextInt();
		
		int sum = jaScore + pyScore + andScore;
		
		//세 과목의 점수의 평균이 80보다 높니?
		if(sum/3>80) {
			System.out.println("합격");
		}else {//위 경우에 해당이 안되면 엘스문으로
			System.out.println("불합격");
		}
		
		
		//선생님 풀이
		//double avg = (jaScore + pyScore + andScore/3.0)
				// 92.88 > 80 (컴퓨터가 알아서 실수로 만들어서 비교함
//		if(avg>80) {
//			System.out.println("합격");
//		}

	}

}
