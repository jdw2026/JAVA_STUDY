package 마우스;

public class Main {

	public static void main(String[] args) {
		
		Mouse m1 = new Mouse();
		//. :참조
		m1.rightClick();
		m1.leftClick();
		m1.drag();
		
		WheelMouse m2 = new WheelMouse();
		m2.scroll();
		m2.leftClick();
		m2.rightClick();
		m2.drag();
		
		HealthMouse m3 = new HealthMouse();
		
		m3.drag();
		m3.leftClick();
		m3.rightClick();
		m3.minus();
		
		
	}

}
