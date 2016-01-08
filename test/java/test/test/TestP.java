package test.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class TestP {
	private Math math;
	private int first;
	private int second;
	private int sum;

	@Before
	public void initialize() {
		math = new Math();
	}

	public TestP(int a, int b, int c) {
		first = a;
		second = b;
		sum = c;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> rolls(){
		return Arrays.asList(new Object[][]{
			{1,2,2},
		});
	}
	
	@Test
	public void Ptest(){
		assertEquals(sum,math.add(first, second) );
	}
}
