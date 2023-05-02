import java.util.Scanner;

public class Ex05_While_4_1 {

	public static void main(String[] args) {
		
//		현재 몸무게와 목표 몸무게를 입력받고
//		주차 별 감량 몸무게를 입력 받으시오
		
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int nowWeight = sc.nextInt();
		System.out.print("목표 몸구게 : ");
		int targetWeight = sc.nextInt(); 
		int a = 1;
		int weight = 0;
		
		while(weight!=10000) {
			System.out.print(a+"주차 감량 몸무게 : ");
			weight=sc.nextInt();
			++a;
		
		
	}

}
	
}
