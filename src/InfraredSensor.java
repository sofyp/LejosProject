import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;

public class InfraredSensor {
	
	EV3IRSensor infraredSensor = new EV3IRSensor(SensorPort.S1);
	
	public InfraredSensor() {
		
	}
	
	public int getRemoteCommand() {
		int remoteCommand = infraredSensor.getRemoteCommand(0);
		return remoteCommand;
	}

}
