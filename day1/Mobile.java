package week3.day1;

public class Mobile {
	
	public void sendMsg()
	{
		System.out.println(" Send me a msg");
	
	}
	public void makeCall()
	{
		System.out.println("Make a call");
	}
	
	public void saveContact()
	{
		System.out.println("Save new contact");
	}
public static void main(String[] args)
{
	Mobile m=new Mobile();
	m.sendMsg();
	m.makeCall();
	m.saveContact();
}
}


