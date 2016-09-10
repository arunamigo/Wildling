import java.util.*;

public class ArrayAndAList {
	public static void main(String[] args) {
		String[] strarray = {"Arun","Valar","Diakar"};
		List<String> strlist = Arrays.asList(strarray);

		strarray[2]="Mama";
		System.out.println(strlist);
		
		
		String[] newarray = strlist.toArray(new String[0]);
		
		for (String s:strarray ) {
		System.out.println(s);

		}
		strlist.set(2,"shreya");

		for (String s:strarray ) {
		System.out.println(s);

		}

		System.out.println(strlist);


	}
}