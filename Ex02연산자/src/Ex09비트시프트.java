
public class Ex09비트시프트 {

	public static void main(String[] args) {
		
		// 비트연산자, 시프트연산자 => 연산을 빠르게 하고 싶을때 (은행)
		int a = 9;  //일반적으로 우리까 쓰는건 10진수  0,1만 쓰는건 2진수
		//비트, 시프트는 2진수를 기반으로 계산하기 때문에 더 빨리작업할수있음
		
		//비트연산 : &(and) |(or) ^(xor) ~(not)-> not은 단항연산자
		int b = 9;    //1001  (9를 2진수로 바꾸면)
		int c = 11;   //1011
		
		//2진수에서 1는 true 0은 false
		System.out.println(b&c); //같은자리수가 하나라도 0면 false(0)
		System.out.println(b|c); // 같은자리수가 하나라도 1이면 true(1)
		System.out.println(b^c); //같으면 false(0), 다르면 true(1)
		
		int d = 6; //0110  not 연산자는 무조건 반대로 바뀜
		System.out.println(~d);  //
		
		
		//시프트 연산 : 비트(0,1)를 옮겨주는 연산
		// <<(비트가 왼쪽으로 옮겨짐) ,  >>(비트가 오른쪽으로 옮겨짐)
		System.out.println(3<<2); //3(2진수) 비트를 왼쪽으로 2칸씩 움직인다.
		

	}

}
