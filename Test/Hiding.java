public class Hiding extends SuperClass{

	static int number=2;		//Hiding a static member
	String sup = "SubClass Param";		//Hiding an instance variable
	public void method(){
		System.out.println("Sub" + number);
		System.out.println(sup);
	}
	public static void main(String[] args) {
		Hiding hide = new Hiding();
		
		hide.method();
		hide.method1();

	}
}