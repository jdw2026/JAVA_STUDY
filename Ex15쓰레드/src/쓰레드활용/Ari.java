package 쓰레드활용;


//여러개 스킬을 동시 사용가능 -> 멀티쓰레딩
//1.Thread 클래스를 확장(상속)
public class Ari extends Thread {
	
	private String skill;
	
	public Ari(String key) {
		this.skill = key;
	}
	
	//Thread 클래스가 가지고 있는 run 메서드 오버라이딩
	//run -> 실제 실행할 기능 정의해주는 메서드 , 하나의 쓰레드가 수행할 한가지 작업을 쓸수있다.
	//		-> 런이 시작하면 쓰레드 시작, 종료되면 쓰레드도 종료 
	public void run() {
		System.out.println("입력 키 : "+ skill);
		
		for(int i=1; i<=3; i++) {
			System.out.println(skill+" 사용중 : "+ i+"s");
		}
		
		System.out.println(skill+" 스킬 사용 종료");
		
	}
	
	
	
}
