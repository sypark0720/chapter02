package Chapter02;

public class Student extends Person {
	
	public Student(int age, String name, int height, int weight){
		//super(); 부모의 생성자를 명시적으로 표시해주고 싶을 때
		System.out.println("Student(int) called");
	}
	
	int weight;
	
	
	
	public void showInfo(){
		age = 30; //default
		name = "amy"; //public
		height = 180; //protected
		
	}

		
	}
	
	
	
