package br.com.primeirotestejava.primeiro;

public class ThirdClass {
	
	public boolean isPalidrome(String name) {
		name = name.toUpperCase();
		String reverse = "";
		for(int i = name.length() - 1; i >= 0; i--)
        {
            reverse = reverse + name.charAt(i);
        }
		
		if(name.equals(reverse)) {
			return true;
		}else {
			return false;
		}
	}
}
