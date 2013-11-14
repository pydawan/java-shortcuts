package shortcuts.unittests;

import org.junit.Assert;
import org.junit.Test;

import shortcuts.$;

@SuppressWarnings("static-access")
public class ShortcutsTest {

	@Test
	public void test() {
		
		String expected = "Thiago";
		
		String actual = $.string.capitalize("thiago");
		
		Assert.assertTrue(expected.equals(actual) );
	}

}
