package PokeMon;

public interface PokeMon {
	
	//pokeMon : 게임 캐릭터가 꼭 가져야할 기능들을 설계
	//인터페이스는 
	// : 반드시 바디가 없는 메서드만 가지고 있어야 한다.
	// : 추상메서드만 가지고 있다.
	//---> 진짜 설계도, 작업 명세서, 프로젝트 설계도
	//필드를 가질수 있지만 필드는 무조건 상수형태로만 가질수 있음
	//--> 절대로 변하지 않을 값들만 필드로 넣어주기
	
	//추상클래스 : 개발자가 원하는데로 메서드를 만들고 구현
	//인터페이스 : 개발자는 우리가 제공한데로 만드세요
	
	
	//atk()
	public abstract void atk();
	
	//specialatk()
	public abstract void specialAtk();
	
	
	
	
	
	
	
	

}
