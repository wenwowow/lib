package Bri;

import Bui.BeanFactory;

public class Client {

	public static void main(String[] args) {
		Color color;
		Pen pen;
		
		color=(Color)BeanFactory.getBean("color");
		pen=(Pen)BeanFactory.getBean("pen");
		
		pen.setColor(color);
		pen.draw("œ ª®");
	}

}
