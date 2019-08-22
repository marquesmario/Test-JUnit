package br.com.primeirotestejava.primeiro;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondClassTest {

	@Test
	public void testFirstNumberBiggerThanSecond() {
		SecondClass tester = new SecondClass();
		 assertEquals("32 is bigger than 12", 32, tester.isThisBigger(32, 12));
	}
	
	@Test
	public void testSecondNumberBiggerThanFirst() {
		SecondClass tester = new SecondClass();
		 assertEquals("16 is lower than 52", 52, tester.isThisBigger(16, 52));
	}
	
	@Test
	public void testNumberAreEqual() {
		SecondClass tester = new SecondClass();
		 assertEquals("12 is equal 12", 0, tester.isThisBigger(12, 12));
	}
	
	//If uncommented it will show a fail in the test
	//@Test
	//public void testShouldShowError() {
	//	SecondClass tester = new SecondClass();
	//	 assertEquals("12 is equal 12", 1, tester.isThisBigger(12, 12));
	//}

}
