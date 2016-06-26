import java.util.function.Predicate;

public class Get21PlusPredicate implements Predicate <Student>{
	@Override
	public boolean test(Student s){

		return (s.getAge() > 21);
	}

}