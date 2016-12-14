class MethOverload {
	
	public static void methodInteger(Integer i){
		System.out.println("Integer");
	}
	
	public static void methodInteger(int i){
		System.out.println("int");
	}											//Java both autoboxes and unboxes if needed

	public static void main(String[] args) {
		methodInteger((Integer)3);
		Integer i = new Integer(5);
		System.out.println(i);
		methodInteger(i);
	}
}