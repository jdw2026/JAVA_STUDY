import java.util.Scanner;

public class Ex06_While_4_2 {

	public static void main(String[] args) {
		
//		주차 별 감량 몸무게를 입력 받을 시 현
//		재 몸무게에서 감량 몸무게를 뺀 후 결과
//		를 출력해보시오.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int nowWeight = sc.nextInt();
		System.out.print("목표 몸구게 : ");
		int targetWeight = sc.nextInt(); 
		int week = 1; //주차별 변수
		int weight = 0; //입력되는 몸무게 받는 변수
		int sumWeight = 0;//감량되는 몸무게 저장 변수
		
		while(weight!=99999) {
			System.out.print(week+"주차 감량 몸무게 : ");
			weight=sc.nextInt();
			sumWeight= sumWeight + weight;
			System.out.println("현재 몸무게 : " + (nowWeight-sumWeight));
			
			++week; 
			
		}
		

	}

}
