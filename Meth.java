public class Meth{

	public static void Meth1(){
		System.out.println("This is First Method");
	}
	public static void Meth2(int i){
		System.out.println("This is Second Method with param " + i);
	}
	public static void main(String[] args) {
		System.out.println("This is Method Overloading");
		
		System.out.println("Calling Method without Param");
		Meth1();
		
		System.out.println("Calling Method with Param");
		Meth2(5);
	}
}