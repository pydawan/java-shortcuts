package shortcuts.app;

import java.util.Date;

import shortcuts.$;
import shortcuts.types.Function;
import shortcuts.types.Range;

@SuppressWarnings("static-access")
public class Application {

	public static void main(String[] args) {
		
		$.each(new Range(1, 50), new Function<Integer>() {			
			public void run() {
				System.out.printf("Indice: %d, Valor: %d\n", this.index, this.value);
			}
		});
		
		$.range('a', 'z').each(new Function<Object>() {
			public void run() {
				System.out.println(this.value);
			}
		});
		
		$.printf("Data atual: %s\n", $.toString(new Date(), "dd/MM/yyyy")	);
		
		$.println($.string.capitalize("java write once run anywhere") );
		
		$.println($.string.reverse($.string.capitalize("java write once run anywhere") ) );
		
		$.println($.range('a', 'z', 3) );
		
		$.println($.string.repeat("$", 50) );
		
		$.println($.date.getDate(new Date() ) );
		
		$.println($.date.getDate(new Date(), "dd/MM/yyyy") );
		
		$.println($.string.isDigit("a") );
		
		$.println($.string.isAlphaNum("1a") );
		
		$.println($.string.isAlpha("1") );
		
		$.println($.string.isSpace("\t") );
		
		$.println($.string.isPalindrome("bab") );
		
		$.println($.string.ljust("THIAGO", 10, "-") );
		
		$.println($.string.rjust("THIAGO", 10, "-") );
		
		$.println($.string.swapCase("THIAGO") );
		
		$.println($.string.swapCase("thiago") );
		
		$.println($.random.randomize("THIAGO") );
		
		$.println($.random.shuffle("THIAGO") );
		
		$.println($.string.center("THIAGO", 50, ".") );
		
		$.println($.string.lstrip("     THIAGO") );
		
		$.println($.string.zfill("1", 10) );
		
		$.println($.string.hexdigits() );
		
		$.println($.string.printable() );
		
	}
}