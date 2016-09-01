class SuperClass  {
	public SuperClass(){
		System.out.println("SuperClass Constructor");
	}

	static {
		int i = 6;
		System.out.println("Superclass static initializer");
	}
		{
			int t=10;
			System.out.println("Superclass Instance");
	}
}

