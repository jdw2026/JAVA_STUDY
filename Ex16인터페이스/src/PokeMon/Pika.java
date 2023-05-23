package PokeMon;


//인터페이스 상속 : implements(구현하다)
//인터페이스는 다중상속이 가능하다, 여러개의 부모를 가질수 있음
public class Pika implements PokeMon,DigiMon{

	@Override
	public void atk() {
		System.out.println("주먹날리기");
		
	}

	@Override
	public void specialAtk() {
		System.out.println("백만볼트~");
		
	}

	
	
	
	
	
	
}
