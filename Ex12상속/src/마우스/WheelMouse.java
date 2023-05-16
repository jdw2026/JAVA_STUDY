package 마우스;

public class WheelMouse extends Mouse{
	
	//extends : 상속 키워드 (기능을 확장한다)
	//자식------> 부몬  화살표 방향이 향하는 이유
	// : 데이터를 탐색해 나가는 방향
	//public class 자식 클래스 뒤쪽에 extends 부모클래스
	
	
//	//1.좌클릭
//	public void leftClick() {
//		System.out.println("좌클릭 따닥");
//	}
//	//2.우클릭
//	public void rightClick() {
//		System.out.println("우클릭 따닥");
//	}
//	//3.드래그
//	public void drag() {
//		System.out.println("드래그");
//	}
	
	//우클릭 좌클릭 드래그 기능은 마우스로부터 상속받고 있는 상태
	
	//------
	//+ 스크롤하기
	public void scroll() {
		System.out.println("스크롤 하기~!");
	}
	
	//HealthMouse
	
	

}
