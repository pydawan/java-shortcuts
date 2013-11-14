package shortcuts;

import java.util.Date;

@SuppressWarnings({"deprecation"})
public abstract class DateShortcuts {

	public static Date getDate() {
		
		Date date = new Date();
		
		// Utilizando os setters da super-classe.
		date.setYear(date.getYear() );
		date.setMonth(date.getMonth() );
		date.setDate(date.getDate() );
		date.setHours(date.getHours() );
		date.setMinutes(date.getMinutes() );
		date.setSeconds(date.getSeconds() );
		
		return date;
	}
	
	public static Date getDate(int year, int month, int date) {
		return new Date(year - 1900, month - 1, date);
	}
	
	public static Date getDate(int year, int month, int date, int hrs, int min) {
		return new Date(year - 1900, month - 1, date, hrs, min);
	}
	
	public static Date getDate(int year, int month, int date, int hrs, int min, int sec) {
		return new Date(year - 1900, month - 1, date, hrs, min, sec);
	}
	
	public static String getDate(Date date) {
		
		return getDate(date, "");
	}
	
	public static String getDate(Date date, String format) {
		
		String formatedDate = "";
		
		if (date != null && format != null) {
			
			if (format.isEmpty() ) {
			
				formatedDate = date.toString();
			} else {
			
				formatedDate = String.format(
						
					"%d-%d-%d %s:%s:%s", 
						
					date.getYear() + 1900,
						
					date.getMonth() + 1,
						
					date.getDate(),
						
					date.getHours(),
						
					date.getMinutes(),
						
					date.getSeconds()
				);
			}
		}
		
		return formatedDate; 
	}
	
}