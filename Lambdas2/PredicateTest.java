import java.util.function.Predicate;
import java.util.*;

public class PredicateTest {

	public static void main(String[] args) {
		List <Animal> list = Arrays.asList(
			new Animal("Shark",true,true,true),
			new Animal("Goat",true,false,false),
			new Animal("Human",true,true,true),
			new Animal("Peacock",true,false,false)
			);

		System.out.println("Printing all animals");
		printThis(list);
		System.out.println("\n"+"================"+"\n");
		printThis(search(list, (Animal a) -> {return a.isSwimmer();}));
		


	}

	public static void printThis(List<Animal> ls) {
		for (Animal a : ls) {
		System.out.println(a.toString());			
		}	}

	public static List <Animal> search(List <Animal> ls, Predicate <Animal> pred){
		List <Animal> list = new ArrayList <>();

		for (Animal a : ls) {
			if(pred.test(a))
				list.add(a);
			
		}
		return list;

	}
	
}