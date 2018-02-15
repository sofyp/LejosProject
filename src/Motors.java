import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Motors extends Thread {
	
	EV3LargeRegulatedMotor motorLeft;
    EV3LargeRegulatedMotor motorRight;
	
    public Motors() {
		
	}
    
    public void run() {
    	motorLeft = new EV3LargeRegulatedMotor(MotorPort.B);
    	motorRight = new EV3LargeRegulatedMotor(MotorPort.A);

    }

	public void driveForward() {
		motorRight.setSpeed(2000);
		motorLeft.setSpeed(2000);
		motorLeft.forward();
		motorRight.forward();
		
	}
	
	public void driveBackward() {
		motorRight.setSpeed(2000);
		motorLeft.setSpeed(2000);
		motorLeft.backward();
		motorRight.backward();
		
	}
	
	public void turnLeft() {
		motorRight.setSpeed(2000);
		motorLeft.setSpeed(2000);
		motorLeft.backward();
		motorRight.forward();
		
	}
	
	public void turnRight() {
		motorRight.setSpeed(2000);
		motorLeft.setSpeed(2000);
		motorLeft.forward();
		motorRight.backward();
		
	}
	
	public void stopMotors() {
		motorRight.setSpeed(0);
		motorLeft.setSpeed(0);
	}
}
