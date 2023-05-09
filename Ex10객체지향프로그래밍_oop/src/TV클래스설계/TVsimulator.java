package TV클래스설계;

public class TVsimulator {

	public static void main(String[] args) {
		
		//TV 객체(object) 생성
		//데이터타입 변수명 = new 데이터타입();
		TV tv1 = new TV();
		TV tv2 = new TV();
		//객체를 만들면 heap 영역에 저장이됨.
		//Stack은 메소드를 호출하면 메소드 변수가 쌓이는 영역.
		// 프로그램을 시작하면 스택에 매인 영역이 만들어짐...
		//코드를 따라 내려오다가 tv를 보고 메인영역안에 tv1 영역을 만듬
		//그다음 tv라는 객체를 heap 영역에 만들고 main 속 tv가 heap의 주소값을 가짐.
		//heap의 tv객체 안에는 필드가 들어있다. 볼륨, 채널, 브랜드명 등등.
		//이어서 tv2도 main 안에 만들어지고 위와 동일하게 된다.
		
		tv1.브랜드이름 = "삼성";
		tv2.브랜드이름 = "LG";
		
		tv1.채널변경하기(30); //채널번호를 30으로 변경
		tv1.채널내리기(); //1씩 감소됨.
		
		System.out.println(tv1.채널); //채널이 바뀌었는지 확인하기.
		
		

	}

}
