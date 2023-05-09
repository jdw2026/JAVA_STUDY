package 성적관리프로그램;

public class Simulator {

	public static void main(String[] args) {
		
		//객체 생성 -> 생성자 호출 
		Student st = new Student("홍길동","001",100,90,80);
		//2객체 생서
		Student st2 = new Student("김지영","002",100,100,100);
		 
//		st.stuName = "홍길동";
//		st.stuNum = "001";
//		st.javaScore = 90;
//		st.dbScore = 80;
//		st.webScore = 70;
		//생성자를 이용해서 집어넣기. 매개변수를 이용해서
		
		//이렇게 직접 접근하는걸 권장하지 않음. 필드를 바로 부르는것.
		//정보은닉과 데이터 보호를 위해...
		//필드에 바로 값을 넣게되면 
		//필드 앞에 접근제한자 private 를 붙여준다.
		
		//데이터 꺼내오기
		System.out.println(st.getStuName());
		System.out.println(st.getStuNum());
		System.out.println(st.getJavaScore());
		
		//set 을 이요해서 학번 수정
		st.setStuNum("002");
		System.out.println(st.getStuNum());
	}

}
