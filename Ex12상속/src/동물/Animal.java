package 동물;

public abstract class Animal {
	
	//추상 키워드 : abstract
	//추상 메서드를 포함하려면 추상 클래스로 바뀌어야함
	//추상 메서드를 포함하고 있지 않아도 추상 클래스가 될 수 있음
	//+ 추상 메서드는 설계만 되어있다.(선언만 되어 있다)
	//+ {body}가 없는 메서드를 보고 추상 메서드라 한다. 

	//public abstract void eat(); // 추상메서드 : 바디가 없는 메서드 그리고 퍼블릭 앞에 abstract
		
	
	public void eat() {
		System.out.println("우걱우걱 먹는다");
		
	}

	public void sleep() {
		System.out.println("쿨쿨 잔다");
		
	}

	public abstract void move();

	
}
