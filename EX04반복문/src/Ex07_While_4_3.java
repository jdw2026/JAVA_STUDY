import java.util.Scanner;

public class Ex07_While_4_3 {

	public static void main(String[] args) {
		
//		사용자가 입력한 목표몸무게가 될때 까지
//		각 주차별로 감량한 몸무게를 입력받고 목
//		표몸무게가 되면 입력을 중단하는 프로그
//		램을 작성하시오

		
//		조건 : 사용자가 입력한 목표몸무게가 될때까지
//		반복 : 각 주차별 감량 몸무게 입력 받기
//		정지 : 목표 몸무게 달성시 종료
		
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int nowWeight = sc.nextInt();
		System.out.print("목표 몸구게 : ");
		int targetWeight = sc.nextInt(); 
		int week = 1; //주차별 변수
		int weight = 0; //입력되는 몸무게 받는 변수
		int sumWeight = 0;//감량되는 몸무게 저장 변수
		
		while(nowWeight-sumWeight>targetWeight) {
			System.out.print(week+"주차 감량 몸무게 : ");
			weight=sc.nextInt();
			sumWeight= sumWeight + weight;
			++week; 
			
		}
		System.out.println("최종몸무게 : "+ (nowWeight-sumWeight));
		System.out.println("축하합니다!!!");
		
	
		//선생님 풀이
		//1. 입력하는 도구 가져오기
		//스캐너 가져오기
		//2. 현재몸무게 : --> 출력문
		//오른쪽에 몸무게 입력받기
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();		
		
		//3. 목표몸무게 : --> 출력문
		// 오른쪽에 입력받기
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		//4. 출력문(반복)
		// 오른쪽에 입력받기
		//4번은 목표몸무게에 도달할때까지 반복
		int week2 = 1;
		
		while(true) {
			System.out.print(week2 + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			
			week++;
			//현재 몸무게 = 현재 몸무게 - minus 감량 몸무게
			now = now-minus; // now -= minus;
			//종료조건
			//now가 목표몸무게에 도달했는지 (작거나 같은지) : while 문을 종료
			if(now <= goal) {
				break;
			}
		}
		
		
		//5. 출력문
		System.out.println(now + "kg 달성!! 축하합니다!");

	}

}
