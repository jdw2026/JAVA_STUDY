
public class test {

	public static void main(String[] args) {
		
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
		
		
		System.out.println();
		
		
		//실습2
		
		int[][] arr2 = new int[4][6];
		
		int num2=21;
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = num2++;
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+"\t");
			}System.out.println();
		}
		
		
		
		
		//실습3
		
		int[][] arr3 = new int[5][5];
		
		int num3 = 1;
		
		for(int i=arr3.length; i<=0; i--) {
			for(int j=arr3[i].length; j<=0; j--) {
				arr3[i][j]=num3++;
			}
		}
		
		
		
		
		

	}

}
