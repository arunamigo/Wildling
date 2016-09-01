public class Overflow {
	public static void main(String[] args) {
		int a = Integer.MIN_VALUE;
		System.out.println(a + " MIN_VALUE");
		System.out.println(Integer.toBinaryString(a) +"\n           In Binary ");
		int b = -a;
		System.out.println(b);

	}
}