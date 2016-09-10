import java.util.*;

public class TradSearch {
	public static void main(String[] args) {
		List <Animal> listOfAnimals = new ArrayList<>();

		listOfAnimals.add(new Animal("Fish",false, true));
		listOfAnimals.add(new Animal("Dog",true,false));
		listOfAnimals.add(new Animal("Turtle",false,true));
		listOfAnimals.add(new Animal("Pigeon",true,false));
		listOfAnimals.add(new Animal("Kangaroo",true,false));
		listOfAnimals.add(new Animal("Frog",true,true));

		print(listOfAnimals,new CheckIfSwimmer());
	}

	public static void print(List<Animal> animalList, CheckTrait check){


		System.out.println("Traditional Search | Swimmers : \n");

		for(Animal ani : animalList){
			if(check.test(ani))
			System.out.println(ani);
		}

		System.out.println("\n====================================\n");

		System.out.println("Lambdas Search | Hoppers : \n");

		for (Animal anim : animalList) {
			if(check.test(anim -> anim.isHopper()));
			System.out.println(anim);
		}


	}
}