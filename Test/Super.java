public class Super {
	public Super(){
		System.out.println("no arg constructor in super class");
	}

	public Super(int i){
		System.out.println("Param constructor in super class");
	}

	static int j;
	static{
		System.out.println("Static block in super class");
	}

	{
		System.out.println("Instance block in Super class");
	}
}