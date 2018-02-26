
public class TouchSensor {

	public TouchSensor() {
				
	EV3TouchSensor touchSensor = new EV3TouchSensor(SensorPort.S3); 
	SensorMode touch = touchSensor.getTouchMode(); 
	float[] sample = new float[touch.sampleSize()];
	Motors motors = new Motors();
	Player player = new Player();
	InfraredSensor infra= new InfraredSensor();
	
	while (!Button.ESCAPE.isDown()) {
	
		touch.fetchSample(sample, 0);
	
		if (sample[0]==1) {
			motors.stopMotors();
			player.playMyHeart(100);
			if (infra.waitRemoteCommand()) {
				motors.start();
			}
		}
	}
	touchSensor.close();	  
	}
}
		

