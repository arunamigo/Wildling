public class Class6 extends Class5
{
	String name = "Class 5!";
    @Override
    public void method()
    {
    	System.out.println("Overridden");
    }

    @Override
    public String toString()
    {
    	return this.name;
    	// return super.toString();	//SuperClass method
    }

    public static void main(String[] args) {
    	Class5 class5 = new Class5();
    	Class6 class6 = new Class6();

    	class5.method();	//Method to be overridden
    	class6.method();	//Overridden methods

		System.out.println(class6.toString());	//Overridden toString() method
		System.out.println(class6.hashCode());

    }
}