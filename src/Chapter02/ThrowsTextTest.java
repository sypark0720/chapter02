package Chapter02;

import java.io.IOException;

public class ThrowsTextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsText tt = new ThrowsText();
		
		tt.dangerousMethod();
		
		try {
			tt.dangerousMethod();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
