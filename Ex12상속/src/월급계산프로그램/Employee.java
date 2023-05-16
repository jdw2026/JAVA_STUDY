package 월급계산프로그램;

public abstract class Employee {
	//protected - 접근제한자 : 상속관계에 있는 클래스들은 접근이 가능하도록 도와줌.
	//						상속관계가 아닌 클래스는 접근 불가능
	protected String empno;
	protected String name;
	protected int pay;
   
	//생성자 : 매개변수 있는거
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}//상속관계에서 부모클래스가 생성자를 가지고 있으면 자식클래스에 super(매개변수); <= 부모생성자가 있어야한다!!
	 
	
	
    public abstract int getMoneyPay(); //temp, part,regular 모두 공통적으로 들어가지만 바디안에 내용이 다름.추상화작업 abstract
    
    
    public String print() { //temp, part,regular 모두 공통적으로 들어가고 바디안에도 똑같음.그래서 바디살려두고 abstract 안함.
    	return empno + " : "+ name + " : "+ pay; 
    }

}
