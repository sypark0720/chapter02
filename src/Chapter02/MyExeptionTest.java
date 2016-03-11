package Chapter02;

import java.io.IOException;

public class MyExeptionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsText tt = new ThrowsText();
		
		try {
			tt.dangerousMethod();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
