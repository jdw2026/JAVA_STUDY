package 메서드;

public class Ex12메서드 {

	public static void main(String[] args) {
		
		//char 는 = 로 비교 가능
		
		
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		System.out.println(cal(num1, num2, op));

	}
	
	//매개변수 (int 2개, char 1개)
	public static int cal(int num1, int num2, char op) {
		
		//op 가 어떤 연산자인지 판단해서 결과값을 보내줘야 한다.
		if(op=='-') {
			return num1 - num2;
		}else if(op=='+') {
			return num1 + num2;
		}else if(op=='*') {
			return num1 * num2;
		}else {
			return num1 / num2;
		}

	}
	
	

}
