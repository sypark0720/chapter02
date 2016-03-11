package Chapter02;

public class ArrayException {

	public static void main( String[] args ) {
		try{
				  
		      int[] intArray = new int[5];
		      intArray[0] = 0;
				  
		      for( int i = 0; i < 5; i++ ) {
		          intArray[ i+1 ] = i + 1 + intArray[ i ];                                       //  i = 4인 경우 예외 발생
		          System.out.println( "intArray[" + i + "]"  + "=" + intArray[ i ] );
		      }
		   }catch(Exception ex){
			   ex.printStackTrace(); 
			   //근원지를 찾아 단계별로 에러 메시지를 출력
			   //비워놓는 게 정말 나쁘다.
		   }
	}
}
