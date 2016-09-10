import java.util.function.Predicate;

public class CheckIfSwimmer implements Predicate <Animal> {
	public boolean test(Animal a){
		return a.isSwimmer();
	}

	public boolean test(){

	}
}