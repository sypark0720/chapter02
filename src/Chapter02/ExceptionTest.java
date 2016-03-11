package Chapter02;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 1;
		double b = 0;
		
		try{
		b = 100/a;
		System.out.println("exception");
		return;
		
		}catch(ArithmeticException ex){
			System.out.println("error occurs:"+ex);
		}finally{//자원정리
	 		System.out.println("clean-up code");	
		}

	}

}
