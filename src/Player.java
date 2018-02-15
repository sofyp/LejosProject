	import java.io.File;
	import lejos.hardware.Sound;

	public class Player {
		
		File myHeart = new File("Celine_Dion_-_My_Heart_Will_Go_On.wav");
		File crash = new File("Tmi_Puuhamies_Pete-[AudioTrimmer.com].wav");
		File eyeOf = new File("eyeofthe.wav");
		File iwill = new File("iwillsurvive.wav");
		
		public Player() {
			
		}
		
		public int playMyHeart(int playtime) {
			
			int playTime = playtime;	
				
			Sound.playSample(myHeart, 1000);
			return playTime;
							
			}
		
		public int playEyeOfThe(int playtime) {
			
			int playTime = playtime;	
				
			Sound.playSample(eyeOf, 1000);
			return playTime;
							
			}
		
		public int playIwill(int playtime) {
			
			int playTime = playtime;	
				
			Sound.playSample(iwill, 1000);
			return playTime;
							
			}
		
		public int playCrash(int playtime) {
			
			int playTime = playtime;	
				
			Sound.playSample(crash, 1000);
			return playTime;
							
			}


	}



