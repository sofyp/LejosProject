import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;

public class ProjektiMain {

	public static void main(String[] args) {
		
		Player player = new Player();
		InfraredSensor infra = new InfraredSensor();
		Motors motors = new Motors();
		TouchSensor touch = new TouchSensor();
		motors.start();
		boolean go = true;
		
		LCD.drawString("Kovvaa ajoa!", 0, 2);
		
		while (go) {
			
			if (Button.ESCAPE.isDown()) {
				go = false;
			}
		
		
		 switch (infra.getRemoteCommand()){
         case 1:
         	motors.driveForward();
         	player.playCrash(100);
             break;
         case 2:
         	motors.driveBackward();
         	break;
         case 3:
         	motors.turnLeft();
         	break;
         case 4:
        	 motors.turnRight();
        	 break;
         case 5:
        	 motors.stopMotors();
        	 break;
         default:
		
		 	}
	touch.run(); //what?
		}
	
	}
}
