package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot m8 = new Robot();
		m8.setSpeed(100);
		m8.penDown();
		m8.setPenColor(Color.RED);
		int x = 0;
		while (x < 4) {
			m8.move(150);
			m8.turn(90);
			x = x + 1;
		}

		
	}
}
