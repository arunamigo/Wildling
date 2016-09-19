import java.util.*;

public class BasicTest {

	public static List <Animal> getSwimmers(List <Animal> animals){
		List <Animal> swimmers = new ArrayList<>();

		for (Animal ani :animals ) {
			if(ani.isSwimmer())
				swimmers.add(ani);
		}

		return swimmers;
	}

	public static void printThis(List<Animal> ls){
		for (Animal a : ls) {
		System.out.println(a.toString());			
		}
	}


	public static void main(String[] args) {
		List <Animal> list = Arrays.asList(
			new Animal("Shark",true,true,true),
			new Animal("Goat",true,false,false),
			new Animal("Human",true,true,true),
			new Animal("Peacock",true,false,false)
			);

		System.out.println("Printing all animals");
		printThis(list);
		System.out.println();
		System.out.println("============================");
		System.out.println();
		System.out.println("Printing Swimmers");
		printThis(getSwimmers(list));

		


	}
	
}