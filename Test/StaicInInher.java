public class StaicInInher extends SuperC {
	static int ID = 8;
	int number = 65;

	void print(){
		System.out.println("Super" + ID);
	}
	public static void main(String[] args) {
		System.out.println(ID);
		
		StaicInInher stat = new StaicInInher();
		stat.print();
		

		SuperC sc = new StaicInInher();
		sc.print();

		System.out.println( "> " + new SuperC().print());
		

		System.out.println(int2);

	}
}

class SuperC {
	static int ID= 6;
	static int int2 = 13;
	int number = 12;

	void print(){
		System.out.println("Sub "+ID);
	}
	
}