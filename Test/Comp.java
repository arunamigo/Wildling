public class Comp {
	public static void main(String[] args) {
		Double d1 = new Double(Double.NaN);
		Double d2 = new Double(Double.NaN);

		double d0 = Double.NaN;
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));

		System.out.println("==================================");
		System.out.println("Doubel values: ");
		System.out.println("d1 is : " + d1);
		System.out.println("d2 is : " + d2);
		System.out.println("==================================");

		Double d3  = new Double(3.14);
		Double d4  = new Double(4.67);
		System.out.println("d2 is : "+ d3);

		d3=d3/0.0;
		d4=d4/0;

		System.out.println("d3 after division : " + d3 );
		System.out.println("d4 after division : " + d4);
		System.out.println("d3 == d3 : " + (d3 == d3));
		System.out.println("d2 == d2 : " + (d2 == d2));
		System.out.println("d0 == d0 : " + (d0 == d0));
		System.out.println("d0 != d0 : " + (d0 != d0));
		System.out.println("==================================");

		System.out.println( 0 == 0.0 ); //True

	}
}