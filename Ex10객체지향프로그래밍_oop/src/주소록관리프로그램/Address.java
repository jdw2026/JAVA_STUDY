package 주소록관리프로그램;

public class Address {
	
	//필드
	private String name;
	private int age;
	private String phoneNumber;
	
	
	
	//메서드
	public Address(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber=phoneNumber;
	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}
	//getter가 필요한이유 private(클래스 외부에서 함부로 접근할수 없도록 만들어주는 제한자)
	//그러므로(클래스 내부에 있는 메서드를 통해서만 접근이 가능하다)를 걸어서 메서드를 만들어준것. 
	

}
