package 메서드;

public class Ex14메서드 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));

	}
	
	public static String getMiddle(String a) {
		
		//글자 수가 짝수개이면 2개 리턴
		//글자의 위치는 만약에 6글자면 3,4 번 위치해 있는 글자가 리턴
		// 글자 수가 홀수이면 1개 리턴
		//글자의 위치가 만약에 5글자면 3위치해 있는 글자가 리턴
		
		int len = a.length()/2;
		
		//문자열의 길이가 짝수인지 홀수인지 판단.
		if(a.length()%2==0) {
			//짝수
			return ""+ a.charAt(len-1)+a.charAt(len);
		}else { //홀수
				//" " + int /char : 뒤에 있는 데이터타입이 자동으로 String 형변환
				return ""+a.charAt(len);
			
		}
		

	}

}
