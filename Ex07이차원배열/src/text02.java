
public class text02 {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][6];
		
		int num = 21;
		
		for(int i=0; i<arr.length; i++) {//총 4개의 1차원 배열을 다룰 수 있음
			for(int j=0; j<arr[i].length; j++) { //1개의 1차원 배열을 다룰 수 있음
				arr[i][j] = num++;
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}
	

	}

}
