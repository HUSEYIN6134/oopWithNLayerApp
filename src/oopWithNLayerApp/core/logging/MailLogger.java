package oopWithNLayerApp.core.logging;

public class MailLogger implements logger {

	@Override
	public void log(String data) {
	     System.out.println("Mail göderildi " + data);
	     
		
	}
	

}
