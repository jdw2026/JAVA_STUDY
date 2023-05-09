package 돼지저금통프로그램;

public class PiggyBank {
	//필드
	private int money;
	//private - 클래스 내부의 메서드를 통해서만 접근이 가능한 제한자
	// 필드에 접근할 수 있도록 내부에 메서드를 만들어주자 -> getter / setter
	//getter --> 다른 클래스에서 money에 있는 값을 확인
	public int getMoney() {
		return money;
	}
	
	//setter --> 다른 클래스에서 money에 있는 값을 수정할 수 있도록
	public void setMoney(int money) {
		this.money = money;
	} //this : 현재 클래스를 지칭하는 키워드
	
	
	//객체를 생성함과 동시에 필드를 초기화 시켜주는 생성자 만들기.
	//생성자의 특징
	//1. 생성자도 메서드다. 소괄호가 붙어있기때문
	//2. 생성자는 이름이 클래스의 이름과 동일하다
	//3. 리턴타입을 지정하지 않는다.
	//4. 매개변수로 아무것도 받지 않는 생성자를 기본생성자
	//--> 기본생성자는 생략(클래스만들때 이미 생략되어 있음)
	//--> 내가 새로운 생성자를 하나 만들어버리면 기본 생성자는 기능을 잃는다.
	//기본 생성자도 사용하고 싶으면 오버로딩.
	public PiggyBank(int money) {
		//main 에서 보내준 값을 현재 필드에 저장.
		this.money = money;
	}
	
	
	//메소드
	public PiggyBank() {// 이 생성자 메소드는 꼭 있어야 하지만 안적어도 컴파일되면서 자동으로 생성해준다.
		//System.out.println("돼지점금통 생성!!");
		//기본 생성자도 사용하고 싶으면 하나 만들어준다(오버로딩)
		//오버로딩 : 같은 클래스 내에서 동일한 이름으로 메서드를 만듬
		//단 매개변수의 형태가 달라야 한다.
	}
	
	public void deposit(int 입금할금액) {
		money += 입금할금액;
	}
	public void withdraw(int 출금할금액) {
		if(money>=출금할금액) { //잔액이 출금할 금액보다 작거나 없으면 인출이 안되도록...
			money -= 출금할금액;
		}
	}
	public int showMoney() {
		//System.out.println("잔액 : "+money); //사용자에게 제일 가까운부분이니 시뮬레이터쪽으로 가는게 좋다.
	    return money;
	}
	

}
