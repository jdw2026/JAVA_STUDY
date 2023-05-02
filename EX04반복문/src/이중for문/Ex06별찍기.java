package 이중for문;

public class Ex06별찍기 {

	public static void main(String[] args) {
		
		
		
		for(int a=5; a>=1; a--) {
			for(int i=2; i<=a; i++) {
				System.out.print(" ");
			}
			for(int j=1; j<=6-a; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
//		//    *
//		for(int i=1; i<=4; i++) {
//			System.out.print(" ");
//		}
//		for(int j=1; j<=1; j++) {
//		System.out.print("*");
//	}
//		System.out.println();
//		//   **
//		for(int i=1; i<=3; i++) {
//			System.out.print(" ");
//		}
//		for(int j=1; j<=2; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		//  ***
//		for(int i=1; i<=2; i++) {
//			System.out.print(" ");
//		}
//		for(int j=1; j<=3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		// ****
//		for(int i=1; i<=1; i++) {
//			System.out.print(" ");
//		}
//		for(int j=1; j<=4; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//*****
//		for(int j=1; j<=5; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		

	}

}
