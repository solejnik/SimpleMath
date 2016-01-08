package test.test;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MathTest {
	private Math math;

	@Before
	public void initialize() {
		math = new Math();
	}
	
	@Test
	public void shouldAddTwoDigits(){
		//given
		int a = 5;
		int b = 4;
		//when
		int c = math.add(a, b);
		//then
		Assert.assertEquals(9, c);
	}
}
