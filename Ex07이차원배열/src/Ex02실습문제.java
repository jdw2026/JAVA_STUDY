import java.util.Scanner;

public class Ex02실습문제 {

	public static void main(String[] args) {
		
		
		  Scanner sc = new Scanner(System.in);
	       
	       int[][] arr = new int[4][]; 
	       
	       arr[0] = new int[3];
	       arr[1] = new int[5];
	       arr[2] = new int[4];
	       arr[3] = new int[6];
	       
	       int[] sum = new int[4];  // 반별로 점수 모음 배열
	       
	      
	       for(int i=0; i<arr.length; i++) {
	          System.out.println((i+1)+"반 점수 입력");
	          
	          for(int j=0; j<arr[i].length; j++) {
	             System.out.print((i+1)+"반 "+(j+1)+" 번째 학생 점수 >> ");
	             int num1 = sc.nextInt();
	             arr[i][j] = num1;
	             if(i==0) {
	                sum[0] += num1;
	             }else if(i==1) {
	                sum[1] += num1;
	             }else if(i==2) {
	                sum[2] += num1;
	             }else {
	                sum[3] += num1;
	             }
	             }System.out.println();
	       }
	       
	       
	       for(int i=0; i<arr.length; i++) {
	          System.out.print((i+1)+"반 >> ");
	          for(int j=0; j<arr[i].length; j++) {
	             System.out.print(arr[i][j]+" ");
	          }System.out.println();
	       
	          System.out.print("총점 : "+ sum[i] + " 평균 : " + (double)sum[i]/arr[i].length);
	          System.out.println();
	       }

		
		

	}

}
