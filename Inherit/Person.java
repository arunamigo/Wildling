class Person{
	public String hairColor;
	private String name;


	public String getName(){
		return name;
	}
	public String greet(){
		System.out.println("Hello, My name is "+ name);
	}
	
	public Person(String name,String hairColor){
		this.name=name;
		this.hairColor=hairColor;
	}
}