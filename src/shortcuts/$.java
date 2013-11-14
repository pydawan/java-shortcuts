package shortcuts;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import shortcuts.types.Function;
import shortcuts.types.Range;


/**
 * Classe de atalhos que aplica idéias do jQuery.
 * 
 * @author thiago.monteiro
 *
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public abstract class $ {

	public Object object;
	
	public Collection collection;
	
	public static StringShortcuts string;
	
	public static DateShortcuts date;
	
	public static RandomShortcuts random;
	
	
	
	public $(Object object, Collection collection) {
		this.object = object;
		this.collection = collection;
	}
	
	public static void each(float[] array, Function function) {		
		
		for (int i = 0; i < array.length; i++) {
			function.index = i;
			function.value = array[i];
			function.run();
		}
	}
	
	public static void each(int[] array, Function function) {		
		
		for (int i = 0; i < array.length; i++) {
			function.index = i;
			function.value = array[i];
			function.run();
		}
	}
	
	public static void each(double[] array, Function function) {		
		
		for (int i = 0; i < array.length; i++) {
			function.index = i;
			function.value = array[i];
			function.run();
		}
	}
	
	public static void each(Object[] array, Function function) {
		
		int i = 0;
		
		for (Object obj : array) {
			function.index = i++;
			function.value = obj;
			function.run();
		}
	}
	
	public static void each(Collection collection, Function function) {
		
		int i = 0;
		
		if (collection != null) {
		
			for (Object obj : collection) {
				function.index = i++;
				function.value = obj;
				function.run();
			}
		}
	}
	
	public static Range range(int start, int end) {
		
		Range range = new Range(start, end);
		
		return range;
	}
	
	public static Range range(int start, int end, int increment) {
		
		Range range = new Range(start, end, increment);
		
		return range;
	}
	
	public static Range range(char start, char end) {
		
		Range range = new Range(start, end);
		
		return range;
	}
	
	public static Range range(char start, char end, int increment) {
		
		Range range = new Range(start, end, increment);
		
		return range;
	}
	
	public static void each(Range range, Function function) {		
		
		for (int i = 0; i < range.size(); i++) {
			function.index = i;
			function.value = range.get(i);
			function.run();
		}
	}
	
	public static List list(Object[] array) {
		
		List l = null;
		
		if (array != null) {
			
			l = new ArrayList();
			
			for (int i = 0; i < array.length; i++) {
				l.add(array[i]);
			}
		}
		
		return l;
		
	}
	
	public static List list(String items) {
		
		List l = null;
		
		if (items != null) {
			
			l = new ArrayList();
			
			for (int i = 0; i < items.length(); i++) {
				l.add(items.charAt(i) );
			}
		}
		
		return l;
	}
	
	public static void print(Object object) {
		if (object != null) {
			System.out.print(object);
		}
	}
	
	public static void print(String format, Object ... objects) {
		// if (objects != null) {			
			// $.print(format, 1, false, objects);
		// }
		
		System.out.printf(format, objects);
	}
	
	public static void print(String format, int amount, boolean vertical, Object ... objects) {
		if (objects != null) {
			
			String[] formats = null;
			
			if (format != null && !format.isEmpty() ) {
				// Fazer split com espaço em branco que não seja seguido de formatador (%)
				formats = format.split(" ");
			}
			
			if (formats.length == objects.length) {
				for (int i = 0; i < objects.length; i++) {
					$.print(formats[i], objects[i], 1, vertical);
				}
			}	
		}
	}
	
	public static void println(Object object) {
		if (object != null) {
			System.out.println(object);
		}
	}
	
	public static void println(Object ... objects) {
		if (objects != null) {
			for (Object object : objects) {
				System.out.println(object);
			}			
		}
	}
	
	public static void print(Object object, int amount) {		
		if (object != null) {
			$.print(object, amount, false);
		}
	}
	
	public static void println(Object object, int amount) {		
		if (object != null) {
			$.println(object, amount, false);
		}
	}
	
	public static void print(String format, Object object, int amount) {		
		if (object != null) {
			$.print(format, object, amount, false);
		}
	}
	
	public static void println(String format, Object object, int amount) {		
		if (object != null) {
			$.println(format, object, amount, false);
		}
	}
	
	public static void print(Object object, int amount, boolean vertical) {		
		if (object != null) {			
			String out = StringShortcuts.repeat(object, amount, vertical);
			print(out);
		}
	}
	
	public static void println(Object object, int amount, boolean vertical) {		
		if (object != null) {			
			String out = StringShortcuts.repeat(object, amount, vertical);
			println(out);
		}
	}
	
	public static void print(String format, Object object, int amount, boolean vertical) {		
		if (object != null) {			
			String out = StringShortcuts.repeat(format, object, amount, vertical);			
			print(out);
		}
	}
	
	public static void println(String format, Object object, int amount, boolean vertical) {		
		if (object != null) {			
			String out = StringShortcuts.repeat(format, object, amount, vertical);			
			println(out);
		}
	}
	
	public static void puts(Object object) {
		print(object);
	}
	
	public static void puts(String string, int amount) {
		
		if (string != null) {
			$.puts(string, amount, false);
		}
	}
	
	public static void puts(String string, int amount, boolean vertical) {
		
		if (string != null) {
			
			String str_out = StringShortcuts.repeat(string, amount, vertical);
			
			System.out.println(str_out);
		}
	}
	
	public static void printf(String format, Object ... text) {
		
		if (text != null) {
			
			if (format != null && !format.trim().isEmpty() ) {
				
				System.out.printf(format, text);
				
			} else {
				
				System.out.println(text);
			}
		}
	}
	
	public static Date date() {
		return new Date();
	}
	
	public static Date date(String date) {
		return date(date, "yyyy-MM-dd");
	}
	
	public static Date date(String date, String format) {
		
		Date _date = new Date();
			
		if (date != null && !date.isEmpty() && format != null && !format.isEmpty() ) {
			
			SimpleDateFormat date_formatter = new SimpleDateFormat(format);
			
			try {
				
				_date = date_formatter.parse(date);
				
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
		}
		
		return _date;
	}
	
	public static String toString(Date date, String format) {
		return StringShortcuts.toString(date, format);
	}
	
}
