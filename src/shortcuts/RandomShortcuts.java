package shortcuts;

import java.util.ArrayList;
import java.util.List;



public abstract class RandomShortcuts {

	public static String randomize(String string) {
		
		if (string != null && !string.isEmpty() ) {
			
			String[] chars = string.split("(?!^)");
			
			int randomNumber = 0;
			int i = 0;
			
			while (i < string.length() ) {
				
				randomNumber = (int) Math.floor(Math.random() * string.length() );
				
				chars[i] = "" + string.charAt(randomNumber);
				
				i++;
			}
			
			return StringShortcuts.join("", chars);
		}
		
		return string;
	}
	
	public static String shuffle(String string) {
		
		if (string != null && !string.isEmpty() ) {
			
			String[] chars = string.split("(?!^)");
			
			int randomNumber = 0;
			int i = 0;

			List<Integer> sorted_random_numbers = new ArrayList<Integer>();
			
			while (i < string.length() ) {
				
				randomNumber = (int) Math.floor(Math.random() * string.length() );
				
				if (!sorted_random_numbers.contains(randomNumber) ) {
					
					chars[i] = "" + string.charAt(randomNumber);
					sorted_random_numbers.add(randomNumber);
					i++;
				}
			}
			
			return StringShortcuts.join("", chars);
		}
		
		return string;
	};

}
