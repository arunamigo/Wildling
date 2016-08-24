import java.util.*;

public class AnonArray1 {
	public static void main(String[] args) {
		// if (args.length == 0) {
		// 	System.out.println("The array length is Zero!");
		// } else {

		System.out.println("The Length of array is " + args.length);
		System.out.println("They are: ");

		for (String s : args) {
			System.out.println(s);
		}



		List<Integer> list = new ArrayList<>();
		list.add(6);
		System.out.println(list);

		int arr []= {1,2};
		System.out.println(arr);
	
	}
}