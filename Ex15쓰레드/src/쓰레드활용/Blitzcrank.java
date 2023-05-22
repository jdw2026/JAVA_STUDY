package 쓰레드활용;


//멀티 쓰레딩 불가능. 동시에 여러스킬 사용 불가능
//사용한 스킬이 완료되기 전까지는 다른 스킬을 사용할 수 없음 -> 단일쓰레딩
public class Blitzcrank {
	
	
	private String skill;
	
	public Blitzcrank(String key) {
		this.skill = key;
	}
	

	public void run() {
		System.out.println("입력 키 : "+ skill);
		
		for(int i=1; i<=3; i++) {
			System.out.println(skill+" 사용중 : "+ i+"s");
		}
		
		System.out.println(skill+" 스킬 사용 종료");
		
	}
	
	
	

}
