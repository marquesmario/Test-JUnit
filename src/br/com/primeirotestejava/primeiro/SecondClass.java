package br.com.primeirotestejava.primeiro;

public class SecondClass {
	
	public int isThisBigger(int a, int b) {
		if(a > b) {
			return a;
		}else if(b > a){
			return b;
		}else {
			return 0;
		}
	}
}
