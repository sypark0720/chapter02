package Chapter02;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//upcasting
		
		Student s = new Student();
		Person p2 = s;
		
		//downcasting
		Person p3 = new Student();
		Student s2 = (Student)p3;
		s2.showInfo();
		
		((Student)p3).showInfo();
	}

}
