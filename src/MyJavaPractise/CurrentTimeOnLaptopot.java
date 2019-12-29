package MyJavaPractise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class CurrentTimeOnLaptopot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
		
		SimpleDateFormat cdt = new SimpleDateFormat("HH:mm:ss.SSS yyyy/MM/dd");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
		

	}

}
