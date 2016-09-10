public class Sub extends Super {
	public Sub(){
		System.out.println("no arg constructor in Sub  Class");
	}

	public Sub(int i){
		System.out.println("Param constructor inSub class");
	}

	static int k;
	static {
		System.out.println("static block in Sub Class");
	}

	{
		System.out.println("Instance block in Sub Class");
	}

	public static void main(String[] args) {
		new Sub(7);


	}
}