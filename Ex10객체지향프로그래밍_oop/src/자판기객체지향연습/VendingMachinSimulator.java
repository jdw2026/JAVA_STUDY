package 자판기객체지향연습;

import java.util.Scanner;

public class VendingMachinSimulator {

	public static void main(String[] args) {
		//프로그램 자체를 돌려주는 객체
		//자판기 객체
		
		//자판기라는 변수.. 변수의 이름은 vm 
		VendingMachin vm = new VendingMachin();
		//vm 이 오브젝트임. 설계도로 만들어진것.
		
		vm.inputMoney(); //자판기야 돈입력받고싶어
		
		vm.menuChoice();
		
		vm.changeMoney();
		

	}
	
	

}
