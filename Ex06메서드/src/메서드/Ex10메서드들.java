package 메서드;

public class Ex10메서드들 {

	public static void main(String[] args) {
		
		//String 관련되 Method 모음
		//indexOf() - 특정 문자열 / 특정 문자의 위치를 반환		
		String data = "여러분 안녕?";
		//"안"이 어디에 있는지 알고싶다.
		data.indexOf("안"); //리턴타입 : int
		System.out.println(data.indexOf("안"));
		System.out.println(data.indexOf("야"));//만약 포함하고 있지 않는 단어라면 -1을 반환.
		
		//contains(String s) -매개변수로 받은 문자열의 포함 여부를 boolean으로 반환
		if(data.contains("안녕?") == true) {
			System.out.println("포함하고 있습니다.");
		}
		
		//charAt(int i) - String data 에서 i 번째 문자를 반환 해주는 기능
		System.out.println(data.charAt(2));
		
		//split(String s) - String 변수를 s 변수 기준으로 잘라 배열로 반환
		String data2 = "010-1234-4567";
		String[] arr = data2.split("-");
		
		System.out.println(arr[1]);
		
		
		
		

	}

}
