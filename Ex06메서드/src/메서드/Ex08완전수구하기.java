package 메서드;

public class Ex08완전수구하기 {

	public static void main(String[] args) {
		
		//1. isDivisor()메소드를 구현하세요. // 약수인지 아닌지
		
		int num1 = 10;
		int num2 =2;
		boolean divisor = isDvisor(num1, num2);
		System.out.println(divisor); //결과값은 true가 출력되어야 함.
		//num2가 num1의 약수인지 아닌지?
		//num1이 num2의 배수인지 아닌지?
		//num2가 num1을 나누어 떨어지게 하는지!
		
		
		
		//2.  // 써있는 숫자의 약수가 무엇인지 구하기
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
		
	
		//3. num 의 약수의 합 구하기
		int num=10;
		int result=getSumOfDivisors(num);
		
		System.out.println(num+ "의 약수의 합 : "+result);
		
		getDivisor(10);
		
		//main 안쪽
		
		//4번
		//완전수인지 아닌지 판단해주는 isPerfectNumber()
		//완전수란? 자기 자신을 제외한 약수의 합이 자기자신과 같은 수 
		// 6 : 1 2 3 ===>6 (완전수)
		//10 : 1 2 5 -->8  (완전수가 아님)
		//28 : 1 2 4 7 14 ----> 28(완전수)
		//true, false
		int num3 = 6;
		boolean result2 = isPerfectNumber(num3);
		System.out.println(result2); // true / false
		
		
		
		//5번, s~e 에서 완전수 출력하는 기능.
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
		
	}
	//1.isDivisor() : 매개 변수 int 자료형 2개,리턴타입은 boolean(true, false) /약수인지 아닌지 판단.
	public static boolean isDvisor(int num1, int num2) {
		
//		boolean divisor = (num1%num2)==0;
//		return divisor;
		
		if(num1 % num2 ==0) {
			return true;
		}else {
			return false;
		}
		
		
		//선생님 풀이
//		if(num1 % num2 ==0) {
//			return true;
//		}else {
//			return false;
//		}
		//is라는 키워드가 붙은 메서드는 결과값이(리턴타입이) 무조건 boolean 이다.
	}

	//2. getDivisor() : 출력하는 기능을 가지고 있다(void), 매개변수 int 1개 / 약수의 종류 출력 메서드
	public static void getDivisor(int num1) {
		
		//num1의 약수를 출렿하는 기능
		//4의 약수 : 
		System.out.print(num1+"의 약수 : ");
		
		for(int i=1; i<=num1; i++) {
			//i가 num1의 약수인지 아닌지? 판단----> true 또는 false로
			// isDivisor()
			//num2가 num1의 약수인지 아닌지??--->  true 또는 false로
            if(isDvisor(num1,i)) {
            	System.out.print(i+" ");
            }
			
			
			//			if(num1%i==0) {
//				System.out.print(i+" ");
//			}
		}System.out.println();
		
		
		
		
	}
	
	//3. getSumOfDivisors() : 매개변수 int 1개, 리턴타입 int / 약수들의 합을 구하는 메서드
	public static int getSumOfDivisors(int num) {
		
		//num1의 약수들의 합 -> 약수들의 합이 들어갈 공간
		int sum=0;
		//1. 약수인지 아닌지 판다
		for(int i=1; i<=num/2; i++) { //i<=num/2; -> 2로 나누는 이유는 약수는 자기 자신뺴고 젤 큰수가 자기의 반이니까. 그대신 리턴값에 자기자신 더해준다.
		  if(isDvisor(num,i)) {
			//2. 누적(합계)
			  sum += i;
		  }	
		}
		
//		int result = num; 
//		return result;
		return sum+num;
		
	}
	
    //4. isPerfectNumber() : 매개변수 int 1개, 리턴타입 boolean 
	public static boolean isPerfectNumber(int num3) {
		
		//완전수가 맞는지 판단
		
		//자기 자신을 제외한 약수의 합 == 자기자신
		if(getSumOfDivisors(num3) - num3 == num3) {
			return true;
		}else {
			return false;
		}
		
		//또는 약수의 합 = 자기자신의 *2배인지
//		if(getSumOfDivisors(num3)==num3*2)
		
	}
	
	//5. getPerfectNumber() : 매개변수 int 2개, 출력하는 기능을 가짐
	public static void getPerfectNumber(int startValue, int endValue) {
		
		System.out.print(startValue + "~" + endValue + "까지의 완전수 : ");
		
		for(int i=startValue; i<=endValue; i++) {
			if(getSumOfDivisors(i) - i == i) {
				System.out.print(i+" ");
			}
			
		}
		
		//또는 선생님 풀이
//		for(int i=startValue; i<=endValue; i++) {
//			if(isPerfectNumber(i)==true) {
//				System.out.print(i+" ");
//			}
//		}
		
		
		

	}
	
	
}    

