package 게임캐릭터;

public class  Wizard extends Charac {
	
	//전진, 점프, 공격 기능을 상속받게 만들자
	
		//전진 --> 빗자루타고 전진
		
		//점프 --> 포털로 이동
		
		//공격 --> 아브라카다브라
	
	//추상 클래스가 물려주는 추상메서드는 반드시 구현해줘야 한다.
	@Override
	public void run() {
		System.out.println("빗자루타고 슝~");
		
	}

	@Override
	public void jump() {
		System.out.println("포털로 이동");
	}

	@Override
	public void atk() {
		System.out.println("아브라카다브라~ o0o");
		
	}//마법사
	
	
	
	

}
