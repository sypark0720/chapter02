package Chapter02;

import java.io.IOException;

public class ThrowsText {
	
	public void dangerousMethod()throws IOException{
		System.out.println("some statement");
		
		if (true){
		throw new IOException();
		}
		
		System.out.println("some statement2");
	
	}

}
