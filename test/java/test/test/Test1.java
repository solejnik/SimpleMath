package test.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Test1 {
	private Math math;
	private int first;
	private int second;
	private int sum;

	@Before
	public void initialize() {
		math = new Math();
	}

	public Test1(int a, int b, int c) {
		first = a;
		second = b;
		sum = c;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> rools(){
		return Arrays.asList(new Object[][]{
			{1,2,3},
			{3,2,5},
			{1,52,523},
		});
	}
	
	@Test
	public void test(){
		assertEquals(sum,math.add(first, second));
	}
}
