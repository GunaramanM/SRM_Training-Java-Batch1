
import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;
  
public class DateApplet extends Applet {

	
		
		@Override
	    public void paint(Graphics g) 
	    {
	        //g.drawString("Hello World", 20, 20);
			Date dt = new Date();
			super.showStatus("Today is" + dt);
	    }
	

}