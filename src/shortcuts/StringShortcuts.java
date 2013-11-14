package shortcuts;

import java.text.SimpleDateFormat;


public abstract class StringShortcuts {
	
	public static String capitalize(String text, String separator) {

		String capitalizedText = "";
		
		if (text != null && !text.trim().isEmpty() && !separator.isEmpty() ) {
			
			String[] texts = text.split(separator);
			
			for (String _text : texts) {
				capitalizedText += String.valueOf(_text.charAt(0) ).toUpperCase() + _text.substring(1).toLowerCase() + separator;
			}
			
			capitalizedText = capitalizedText.substring(0, capitalizedText.length() - 1);
		}
		
		return capitalizedText;
	}
	
	public static String capitalize(String text) {
		
		return capitalize(text, " ");
	}
	
	public static String upper(String text) {
		
		String s = "";
		
		if (text != null && !text.isEmpty() ) {
			s = text.toUpperCase();
		}
		
		return s;
	}
	
	public static String lower(String text) {
		
		String s = "";
		
		if (text != null && !text.isEmpty() ) {
			s = text.toLowerCase();
		}
		
		return s;
	}
	
	public static String repeat(Object object, int amount) {
		
		String s = "";
		
		s = repeat(object, amount, false);
		
		return s;
	}
	
	public static String repeat(Object object, int amount, boolean vertical) {
		
		String s = "";
		
		s = StringShortcuts.repeat("", object, amount, vertical);
		
		return s;
	}
	
	public static String repeat(String format, Object object, int amount, boolean vertical) {
		
		String s = "";
		
		if (object != null && !object.toString().isEmpty() && amount > 0) {
			
			for (int i = 0; i < amount; i++) {
				
				if (vertical) {
					if (format == null || format.isEmpty() ) {
						s += object + "\n";
					} else {
						s += String.format(format, object) + "\n";
					}						
				} else {
					if (format == null || format.isEmpty() ) {
						s += object;
					} else {
						s += String.format(format, object);
					}
				}					
			}
			
			if (vertical) {
				s = s.substring(0, s.lastIndexOf("\n") );
			}
		}
		
		return s;
	}
	
	public static String toString(java.util.Date date, String format) {
		
		String _date = "";
		
		if (date != null) {
			
			if (format != null && !format.trim().isEmpty() ) {
				
				SimpleDateFormat date_formatter = new SimpleDateFormat(format);
				
				_date = date_formatter.format(date);
			}
		}
		
		return _date;
	}
	
	public static String reverse(String string) {
		
		String reversedString = "";
		
		if (string != null) {
		
			for (int i = string.length() - 1; i >= 0; i--) {
				reversedString += string.charAt(i);
			}
		}
		
		return reversedString;
	}
	
	public static boolean isDigit(String string) {
		
		boolean answer = false;
		
		if (string != null && !string.isEmpty() ) {
			
			answer = string.matches("^(\\d)+$");
		}
		
		return answer;		
	}

	public static boolean isAlphaNum(String string) {
		
		boolean answer = false;
		
		if (string != null && !string.isEmpty() ) {
			
			answer = string.matches("[\\w\\d]+");
		}
		
		return answer;
	}

	
	public static boolean isAlpha(String string) {
		
		boolean answer = false;
		
		if (string != null && !string.isEmpty() ) {
			
			answer = string.matches("^[a-zA-z]+$");
		}
		
		return answer;
	}

	public static boolean isSpace(String string) {
		
		boolean answer = false;
		
		if (string != null && !string.isEmpty() ) {			
		
			answer = string.matches("^\\s+$");
		}
		
		return answer;
	}
	
	public static boolean isUpperCase(String string) {
		
		boolean answer = false;
		
		if (string != null && !string.isEmpty() ) {
			
			answer = string == string.toUpperCase();
		}
		
		return answer;
	}

	public static boolean isLowerCase(String string) {
		
		boolean answer = false;
		
		if (string != null && !string.isEmpty() ) {
			
			answer = string == string.toLowerCase();
		}
		
		return answer;
	}

	public static boolean isPalindrome(String string) {
		
		boolean answer = false;
		
		if (string != null && !string.isEmpty() ) {
			
			answer = string.equals(reverse(string) );
		}
		
		return answer;
	}
	
	public static String leftJust(String string, int width, String fillchar) {
		
		if (string != null && !string.isEmpty() && width > 0 && fillchar != null && !fillchar.isEmpty() ) {
		
			if (width > fillchar.length() ) {
				return string + repeat(fillchar, (width - string.length() ) );
			}
		}
		
		return string;
	}
	
	public static String rightJust(String string, int width, String fillchar) {
		
		if (string != null && !string.isEmpty() && width > 0 && fillchar != null && !fillchar.isEmpty() ) {
		
			if (width > fillchar.length() ) {
				return repeat(fillchar, (width - string.length() ) ) + string;
			}
		}
		
		return string;
	}
	
	public static String center(String string, int width, String fillchar) {
		return "";
	}
	
	public static String swapCase(String string) {
		
		if (string != null && !string.isEmpty() ) {
			
			return isUpperCase(string) ? string.toLowerCase() : string.toUpperCase();
		}
		
		return string;
		
	}
	
	
	public static String join(String separator, String[] strings) {
		
		StringBuilder sb = new StringBuilder();
		
		for (String string : strings) {
			
			sb.append(string);
			sb.append(separator);
		}
		
		return sb.toString();
	}
	
}
