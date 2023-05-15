import java.util.Stack;

public class Ex01스택 {

	public static void main(String[] args) {
		
		//1. 스택 생성 - 스택도 임폴트 해줘야함.
		Stack<String> st = new Stack<String>();
		
		//2. 요소 삽입(push)
		st.push("Hello");
		st.push("Hi");
		String a = st.push("Java");
		
		//3. 가장 마지막에 들어간 요소 확인 (top 에서 제일 가까운 요소) / 출력
		st.peek();
		System.out.println(st.peek());
		
		//4. 특정 요소의 위치 확인 스택은 맨위에부터 1번.
		st.search("Hello");
		System.out.println(st.search("Hello"));
		System.out.println(st.search("Hi"));
		System.out.println(st.search("Java"));
		
		//5. 요소 삭제
		String e = st.pop();
		System.out.println(e);
		
		//6. Stack 이 비어있는지 확인
		//empty  : 비어있으면 -> true, 요소가 하나라도 있으면 -> false
		st.empty();
		System.out.println(st.empty());
		
		
		

	}

}
