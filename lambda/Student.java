public class Student{
	
	private String firstName;
	private String lastName;
	float gradeAverage;
	int age;

	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public float getGrade(){
		return gradeAverage;
	}
	public int getAge(){
		return age;
	}
	public Student(String fName,String lName, float gradeAverage, int age){
		this.firstName=fName;
		this.lastName=lName;
		this.gradeAverage=gradeAverage;
		this.age=age;		
	}
}