package br.com.primeirotestejava.primeiro;


import static org.junit.Assert.*;

import org.junit.Test;

public class FirstClassTest {

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
	    FirstClass tester = new FirstClass();
	    tester.multiply(1000, 5);
	  }

	  @Test
	  public void testMultiply() {
	    FirstClass tester = new FirstClass();
	    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	  }

}
