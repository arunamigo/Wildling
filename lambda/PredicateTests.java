import java.util.function.Predicate;
import java.util.*;



public class PredicateTests{

	public static List <Student> getMatching(List <Student> ls, Predicate <Student> ps){
	List <Student> results = new ArrayList <Student>();
	for ( Student s: ls) {
		if (ps.test(s)) {
			results.add(s);
			}
		}
	return results;
	}

	public static void printList(List<Student> list){
		for (Student s : list) {
		System.out.println("First Name: " + s.getFirstName() + " Last Name: " + s.getLastName() +" Grade: " + s.getGrade()+" Age: "+ s.getAge());			
		}
	}

	public static void main(String[] args) {
		List <Student> slist = Arrays.asList(
			new Student("Arun","Gajaraj",8.0F,22),
			new Student("Valarmathi","Murugesan",9.0F,23),
			new Student("Divakar","Raju",8.1F,21),
			new Student("Shreya","Pandey",7.5F,20)
			);

		printList(slist);
		System.out.println(slist);
		System.out.println("21 Plus: ");
		System.out.println(getMatching(slist,new Get21PlusPredicate()));
		List <Student> stu21Plus = getMatching(slist,new Get21PlusPredicate());
		printList(stu21Plus);

		System.out.println("Until M");
		List <Student> stuUntilM = getMatching(slist,new GetUntilM());
		printList(stuUntilM);
	}


}