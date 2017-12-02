package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings.
	// One robot should draw one ring simultaneously with the other 4 robots.
	/*
	 * BLUE BLACK RED YELLOW GREEN
	 */
	static Robot blue = new Robot(100, 100, "vic");
	static Robot black = new Robot(200, 100, "june");
	static Robot red = new Robot(300, 100, "batman");
	static Robot yellow = new Robot(150, 200, "mini");
	static Robot green = new Robot(250, 200);

	public static void main(String[] args) {
		new Thread(() -> makeBlue()).start();
		new Thread(() -> makeBlack()).start();
		new Thread(() -> makeRed()).start();
		new Thread(() -> makeYellow()).start();
		new Thread(() -> makeGreen()).start();
	}

	public static void makeBlue() {
		// Blue
		blue.setPenColor(new Color(0, 0, 255));
		blue.setSpeed(10);
		blue.setPenWidth(10);
		blue.penDown();
		int b = 0;
		while (b < 360) {
			blue.move(1);
			blue.turn(1);
			b++;
		}
		blue.penUp();
		blue.hide();
	}

	public static void makeBlack() {
		// Black
		black.setPenColor(new Color(0, 0, 0));
		black.setSpeed(10);
		black.setPenWidth(10);
		black.penDown();
		int bl = 0;
		while (bl < 360) {
			black.move(1);
			black.turn(1);
			bl++;
		}
		black.penUp();
		black.hide();
	}

	public static void makeRed() {
		// Red
		red.setPenColor(new Color(255, 0, 0));
		red.setSpeed(10);
		red.setPenWidth(10);
		red.penDown();
		int r = 0;
		while (r < 360) {
			red.move(1);
			red.turn(1);
			r++;
		}
		red.penUp();
		red.hide();
	}

	public static void makeYellow() {
		// Yellow
		yellow.setPenColor(new Color(255, 255, 0));
		yellow.setSpeed(10);
		yellow.setPenWidth(10);
		yellow.penDown();
		int y = 0;
		while (y < 360) {
			yellow.move(1);
			yellow.turn(1);
			y++;
		}
		yellow.penUp();
		yellow.hide();
	}

	public static void makeGreen() {
		// Green
		green.setPenColor(new Color(0, 153, 85));
		green.setSpeed(10);
		green.setPenWidth(10);
		green.penDown();
		int g = 0;
		while (g < 360) {
			green.move(1);
			green.turn(1);
			g++;
		}
		green.penUp();
		green.hide();
	}
}
