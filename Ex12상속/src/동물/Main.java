package 동물;

public class Main {

	public static void main(String[] args) {
		
		//Animal a1 = new Animal();
		//추상 클래스는 객체 생성이 불가능
		//추상화된 개념은 실물로 만드는게 불가능
		System.out.println("동물은");
		//a1.eat();
		//a1.sleep();
		//a1.move();
		System.out.println();
		
		Bird b1 = new Bird();
		System.out.println("조류는");
		b1.eat();
		b1.sleep();
		b1.move();  //Bird  클래스에서 오버라이딩된 메서드!
		System.out.println();
		
		Cham c1 = new Cham();
		System.out.println("참새는");
		c1.eat();
		c1.sleep();
		c1.move();
		c1.cry(); 
		System.out.println();
		
		Pang p1 = new Pang();
		System.out.println("펭귄은");
		p1.eat();
		p1.sleep();
		p1.move(); 
		System.out.println();
		
		
		//형변환 (Casting)
		//기본 데이터 타입에 대한 형변환 : 데이터의 크기를 변환하는 기능
		//객체의 타입에 대한 형변환 : 객체의 타입을 변환한다...
		//동물 -> 펭귄, 동물 -> 조류
		//조건 
		//객체 타입에 대하여 형변환을 진행할때는 꼭 상속에 대한 개념이 포함되어야한다
		//상속관계여야만 형변환이 가능함.
		//업캐스팅 vs 다운캐스팅
		
		//묵시적(자동)형변환 : (업캐스팅 개념)
		// 자식 클래스가 부모 클래스의 타입으로 형태가 변형 되는 것
		//ex) 참새(cham)는 동물(animal)이다.
		//업캐스팅
		Animal a2 = new Pang(); //참새를 동물로
		Animal a3 = new Cham();
		
		//다운캐스팅 : 부----> 자식
		//ex)동물은 참새이다? / 동물은 펭귄이다?
		//명시적 형변환이다.
		//Cham c2 = (Cham)new Animal();  ->불가능
		//다운 캐스팅의 조건
		//업캐스팅된 객체만 다운 캐스팅 할 수 있다.
		
		Pang p3 = (Pang)a2;  // 위에서 업캐스팅된 객체만 다운캐스팅 됨.
		
		
		//업캐스팅 (자동 형변환)
		// : 자식클래스를 부모클래스 자료형으로 변환
		//다운캐스팅 (명시적 형변환)
		// : 업캐스팅된 객체가 원래의 객채타입으로 돌아가는것
		
		
		
		
		

	}

}
