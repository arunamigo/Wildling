class StringPool{
	public static void main(String[] args) {
		

		String s = "Hello";
		// if("Hello1".equals(s))
		//   System.out.println("one");
		// if("Hello1"==s)
		//   System.out.println("four");
		String a = "";
		a+="Hello";

		String a1= "Hello";

		System.out.println("Hello".equals(s));
		System.out.println(s.equals("Hello"));		
		System.out.println("Hello"==s);
		System.out.println(s=="Hello");
		System.out.println();

		System.out.println(a=="Hello");
		System.out.println("Hello"==a);
	
		System.out.println(a1=="Hello");
		System.out.println("Hello"==a1);

	}


}