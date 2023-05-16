package 게임캐릭터;

public class Main {

	public static void main(String[] args) {
		
		//추상클래스는 객체생성이 불가능하다 그래서 캐릭 클래스는 객체생성 불가능.
		
		//마법사
		Wizard harry = new Wizard();
		harry.atk();
		harry.run();
		harry.jump();
		System.out.println();
		
		//전사
		Warrior w = new Warrior();
		w.atk();
		w.jump();
		w.run();
		

	}

}
