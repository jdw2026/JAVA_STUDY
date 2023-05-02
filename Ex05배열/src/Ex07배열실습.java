import java.util.Scanner;

public class Ex07배열실습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] answer = {1,4,3,2,1}; //실제답
		int[] input = new int[5];  //사용자가 입력한답
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		int score = 0;
		
		//답 입력
		for(int i=0; i<input.length; i++) {
			System.out.print((i+1) + "번답>> ");
			input[i] = sc.nextInt();
			
		}//System.out.print("입력한 답은 : ");
		for(int i=0; i<input.length; i++) { // 입력한 답과 실제답이 같은지 체크
			//System.out.print(result[i] + " ");
			
			if(answer[i]==input[i]) { //답일경우
				System.out.print("O" + " ");
				score += 20;
				
			}else { //틀렸을 경우
				System.out.print("X" + " ");
			}
		}
		System.out.print("총점 : " + score);
		
		
		
		//위에를 for문 하나로 쓰기
		
//		int score2 = 0;
//		String check = "";
//		for(int i=0; i<input.length; i++) {
//			System.out.print((i+1) + "번답>> ");
//			input[i] = sc.nextInt();
//			
//			
//			if(answer[i]==input[i]) { //답일경우
//				check = check + "O ";
//				score2 += 20;
//				
//			}else { //틀렸을 경우
//				check = check + "X ";
//			}
//			
//		}
//		System.out.println(check);
//		System.out.print("총점 : " + score2);
	

		
	}

}
