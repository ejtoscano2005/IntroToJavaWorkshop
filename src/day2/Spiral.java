package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
Robot kermit = new Robot();		
		// 5. Set your robot's pen to the down position
kermit.penDown();		
		// 3. Set the robot to go at max speed (10)
kermit.setSpeed(100);	
		// 4. Do the following (steps 6-8) 75 times
int y = 1;
while (y < 75){
	
			

			// 7. Change the pen color to random
kermit.setRandomPenColor();		
			// 6. Move the robot 5 times the current line number you are drawing (5*i)			
kermit.move(y*5);
			// 2. Turn the robot 1/7 of 360 degrees to the right
kermit.turn(360/7);		
			// 8. Set the pen width to i
kermit.setPenWidth(y);
y = y+1;
}
	}
}
