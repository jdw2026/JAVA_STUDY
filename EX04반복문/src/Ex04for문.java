import java.util.Scanner;

public class Ex04for문 {

	public static void main(String[] args) {
		
		//입력 받은 정수의 약수를 구하세요
		//약수 - 약수는 나누면 나머지가 0이고 자기자신보다 클수 없다.
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.print(num+"의 약수 : ");
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+ " ");
			}
			
		}
		//약수 특징
		//1. 자기보다 큰 수를 약수로 가지고 있지 않음
		//2. 모든 숫자들의 가장 작은 약수는 1
		// 32 : 1 2 4 8 16 32
		// 24 : 1 2 3 4 6 8 12 24
		//마지막은 자기자신이고 바로 전 숫자는 자신을 반으로 나눈거다.
		// 자기자신의 절반과 자기자신 사이에 약수는 존재하지 않는다.
		//즉 1씩 계속 커져서 계속 확인하는것보다 빠르게 계산이 가능하다.
		

	}

}
