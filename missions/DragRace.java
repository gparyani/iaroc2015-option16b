package missions;
import lejos.util.Delay;
public class DragRace {
	static TetrixRobot texBot = new TetrixRobot();
	public static void goForward() {
		texBot.setAllPower(100);
		texBot.moveNorth();
		while (texBot.getDistanceNorth() > 50) {
			if (texBot.binaryNorthWest()) {
				texBot.moveEast();
				texBot.setEastPower(35);
				Delay.msDelay(300);
			} else if (texBot.binaryEast()) {
				texBot.moveWest();
				texBot.setWestPower(35);
				Delay.msDelay(300);
			} else {
				texBot.motorNorth.stop();
				texBot.motorSouth.stop();
			}
			texBot.setAllPower(100);
			Delay.msDelay(5);
		}
		texBot.stop();
	}
	public static void main(String[] args) {	
		goForward();
		texBot.setAllPower(80);
		texBot.moveSouth();
		Delay.msDelay(500);
		texBot.spinLeft();
		Delay.msDelay(1200);
		texBot.stop();
		goForward();
	}
	

}
