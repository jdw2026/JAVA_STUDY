package 동물;

public class Cham extends Animal {

	@Override
	public void move() {
		System.out.println("파닥파닥 날아다닌다");
		
	}
	
	public void cry() {
		System.out.println("짹짹 거린다");
	}
	//추상 메서드와 클래스의 특징 
	//설계되어있는 추상메서드의 구현을 강제화
	//동물이라면 당연하게 가지고 있어야하는 기능들을 개발자가
	//잊어버리지 않도록 강제화 시켜줌.
	

	
	

}
