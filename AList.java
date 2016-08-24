import java.util.*;
public class AList{
	public static void main(String[] args) {
		ArrayList  list1 =  new ArrayList ();
		list1.add("Hello");
		list1.add(Boolean.TRUE);
		list1.add(4);
		list1.add(false);

		System.out.println(list1);

		List <String> Buddies= new ArrayList <>();

		Buddies.add("Arun");
		Buddies.add(0,"Valar");
		Buddies.add(2,"Divakar");
		Buddies.add("Shiva");
	System.out.println(Buddies);


	List<String> colist = new ArrayList<>();
	colist.add("42");
	colist.add("16");
	// colist.add(27);  //In Generics only same type can be used
	System.out.println(colist);

	Object[] objArray = colist.toArray(); //Defaultly converts ArrayList to Array of type Objects
	for (Object obj : objArray) {
		System.out.println(obj);
	}System.out.println("Created as Object Array");

	String [] ilist = colist.toArray(new String[0]); // Converts to Array of type String
	for (String str : ilist) {
	System.out.println(str);	
	}
	System.out.println("Created as String Array");

	//Converting from Array to List (backed List)

	String[] strArray= {"Arun", "Valar","Divakar","Shreya"};
	List<String> slist = Arrays.asList(strArray);


	System.out.println(slist); // String Array is converted to List<String>


	}
}