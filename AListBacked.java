import java.util.*;

public class AListBacked {
	public static void main(String[] args) {
		String a [] = {"One","Two"};
		List <String> list = Arrays.asList(a);

		a[1] = "Four";

		System.out.println(list);
		list.set(0,"Temp");

		for (String s : a) {
			System.out.println(s);
		}
	}
}