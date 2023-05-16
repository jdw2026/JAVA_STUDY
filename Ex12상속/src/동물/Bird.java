package 동물;

public class Bird extends Animal{
	
	
	
	//오버라이딩 : 상속 관계에서 메서드를 구현단{}만 다르게 작성
	
	//@ : annotation(어노테이션)
	// 현재 메서드는 부모로부터 물려받은 메서드를 오버라이드 하고 있습니다 라는 뜻.
	
	@Override
	public void move() {
		System.out.println("날개로 날아다닌다");
	}
	//추상화되서 오버라이드는 주석처리.
	
	
	
	
}
