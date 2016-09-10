public class WildClass{

	public Encap meth(){
		System.out.println("Method with Encap as return Type");
		return new Encap();
	}

	void method() {
		return;	//Optional
	} //Method with no return type

	String trickyMethod(int i) {
		if (i==9) ;{return "";}
	}

	int varArgMethod(String j, String... num) { 	//Methos with Var Arg parameter
		for (String ii : num) {
			System.out.println(ii);
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println("Hey Hello Fellow Freefolks!!!!");

		String str[] = new String[3];
		str[0]="Arun";str[1]="valar";str[2]="Hello";
		new WildClass().varArgMethod("",str);
	}
}