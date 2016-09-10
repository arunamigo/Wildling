import java.util.*;

public class BasicTests{

	public List <Student> get21Plus(List <Student> ls){
		List <Student> results21Plus = new ArrayList<>();
		for (Student s : ls) {
			if (s.getAge() > 21){
				results21Plus.add(s);
			}
		}
		return results21Plus;
	}

	public List <Student> getFirstHalfAlphabet(List <Student> ls1){
		List <Student> resultsUntilM = new ArrayList <>();
		for (Student s : ls1) {
		if (Character.toLowerCase(s.getFirstName().charAt(0)) <= 'm') {
					resultsUntilM.add(s);	
					}			
		}
		return resultsUntilM;
	}

	public static void printList(List<Student> list){
		for (Student s : list) {
		System.out.println("First Name: " + s.getFirstName() + " Last Name: " + s.getLastName() +" Grade: " + s.getGrade()+" Age: "+ s.getAge());			
		}
	}

	public static void main(String[] args) {
	
	List <Student> list = Arrays.asList(new Student("Arun","Gajaraj",8.0F,22), new Student("Valarmathi","Murugesan",9.0F,23));

	// System.out.println("The List: " + list); //Prints Student Objects
	printList(list);
	}

}