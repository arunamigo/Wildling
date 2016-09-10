
class TestClass {
	public static void main(String[] args) {
		int ib = 0b010101;
		int ix = 0xF34A;
		int io = 07676;

		double db = 0b010101;
		double dx = 0xF34A;
		double doc = 07676;

		float fb = 0b010101;
		float fx = 0xF34A;
		float fo = 07676;

		System.out.println(ib + " " + ix + " " + io + " " );
		System.out.println(db + " " + dx + " " + doc + " " );
		System.out.println(ib + " " + ix + " " + fo + " " );

		Integer i = 4;
		System.out.println(i);
		int j = i;
		System.out.println(j);

		long y = j * 4 - j++;
		System.out.println(y);
		System.out.println("j is "+ j);

	}
}