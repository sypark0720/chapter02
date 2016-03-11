package Chapter02;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a = new Student(10, "Amy", 150, 40);
		System.out.println(a.age+a.name+a.height);
		Student s = (Student)a;
		System.out.println(s.age+","+s.name+","+s.height+","+s.weight);
		
		
		
	}

}
