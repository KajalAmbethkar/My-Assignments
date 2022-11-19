package week3.day1;

public class Androidphone extends Mobile {
	
	public void takeVideo()
	{
		System.out.println("Take a video");
	}

	public static void main(String[] args) {
	

		Androidphone android=new Androidphone();
		android.takeVideo();
		android.sendMsg();
		android.makeCall();
		android.saveContact();
	}

}
