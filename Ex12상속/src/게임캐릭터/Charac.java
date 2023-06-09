package 게임캐릭터;

public abstract class Charac {//추상메서드를 포함하고 있는 클래스는 추상클래스로 바꿔야한다.
	
	//전진 run
	public abstract void run();
	
	//점프 jump
	public abstract void jump();
	//공격 atk
	public abstract void atk();
	
	//추상 메서드를 만들어주는 이유
	//-->모든 캐릭터(마법사, 전사 등..) 전진, 점프, 공격을 가지고 있으나 바디의 형태가 다 다름
	//   그래서 설계만 해놓고 상속받는 자식들만 구현되게 만들기위해.
	//게임캐릭터들은 무조건 전진, 점프, 공격 무조건 가지고 있어야 한다.
	//--> 부모를 물려받는 자식클래스에 구현을 강제화 시켜준다.
	//추상클래스를 상속받으면 추상클래스 안에 있는 추상메서드를 반드시 구현해야한다.

}
