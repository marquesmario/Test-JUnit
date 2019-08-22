package br.com.primeirotestejava.primeiro;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThirdClassTest {

	String name1 = "Ana";
	String name2 = "Paulo";
	
	@Test
	public void testShouldBePalidrome() {
		ThirdClass tester = new ThirdClass();
		assertTrue("Ana should be a palidrome",tester.isPalidrome(name1));
	}
	
	@Test
	public void testShouldNotBePalidrome() {
		ThirdClass tester = new ThirdClass();
		assertFalse("Paulo shouldn't be a palidrome",tester.isPalidrome(name2));
	}

}
