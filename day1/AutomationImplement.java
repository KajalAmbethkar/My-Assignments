package week3.day1;

public class AutomationImplement extends MultipleLangauge {

	@Override
	public void ruby() {
	System.out.println("Hi!This is Ruby");
		
	}
public static void main(String[] args) {
		
		AutomationImplement auto=new AutomationImplement();
		auto.Java();
		auto.Selenium();
		auto.python();
		auto.ruby();
}

}