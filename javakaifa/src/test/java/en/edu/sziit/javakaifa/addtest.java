package en.edu.sziit.javakaifa;

import junit.framework.Assert;
import junit.framework.TestCase;

public class addtest extends TestCase {
	private Calcalator cal;
	public void setUp() {
		cal= new Calcalator();
	}
	public void testAdd() {
		int result= cal.add(300, 500);
		Assert.assertEquals(800, result);
	}

}
