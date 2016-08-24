class SubClass extends SuperClass {
	public SubClass(){
		super();  //Implicitly called
		System.out.println("SubClass Constructor");
	}

	static {
		System.out.println("SubClass static init");
	}
	{
			int t=10;
			System.out.println("SubClass Instance");
	}

	public static void main(String[] args) {
		SubClass sc = new SubClass();

	}
}