package week3.day1;

public class SmartPhone extends Androidphone{
	
	public void connectWhatsApp()
	{
		System.out.println("PLease conncet to whats app");
	}
	public void takeVideo()
	{
		System.out.println("Take a video in SmartPhone");
	}


	public static void main(String[] args) {
		
		SmartPhone smart=new SmartPhone();
		smart.sendMsg();
		smart.makeCall();
		smart.saveContact();
		smart.takeVideo();
		smart.connectWhatsApp();
		

	}

}
