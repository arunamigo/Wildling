public class MethParam{
	
	void print(byte x) {
		System.out.println("byte");
	}
	
	void print(int x) {
		System.out.println("int");
	}

	void print(float x) {
		System.out.println("float");
	}
	void print(Object x) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		MethParam mp = new MethParam();

		short s = 23;
		mp.print(s);
		mp.print(true);
		mp.print(5.987);
		mp.print(24);

	}
	
}