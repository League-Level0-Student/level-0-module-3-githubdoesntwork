//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		String answer;
		Robot ree = new Robot();

		// 3. Ask the user what color they would like the robot to draw
		answer = JOptionPane.showInputDialog("What color do you want to draw?");
		// 5. Use an if/else statement to set the pen color that the user requested

		
		for (int i = 0; i < 1; i++) {
			if (answer.equals("red")) {
				ree.setPenColor(Color.red);
			} else if (answer.equals("blue")) {
				ree.setPenColor(Color.blue);
			}
			// 6. If the user doesn’t enter anything, choose a random color
			if (answer.equals("")) {
				ree.setPenColor(Color.green);
			}
		
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10
ree.setPenWidth(10);
		// 2. Make the robot draw a shape (this will take more than one line of code)
ree.penDown();
ree.move(100);
ree.turn(90);
ree.move(100);
ree.turn(90);
ree.move(100);
ree.turn(90);
ree.move(100);
		}
	}
}
