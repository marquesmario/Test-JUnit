package br.com.primeirotestejava.primeiro;

public class FirstClass {
	
	public int multiply(int x, int y) {
	    // the following is just an example
	    if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000");
	    }
	    //If you change the operation for division it will appear a error in the test
	    return x * y;
	  }
}
