import java.util.function.Predicate;

public class GetUntilM implements Predicate <Student>{

	@Override
	public boolean test(Student s){
	return (Character.toLowerCase(s.getFirstName().charAt(0)) <= 'm');
	}
}