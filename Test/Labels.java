public class Labels {
	public static void main(String[] args) {
		
		int i=6;

		block1: {
			System.out.println("Line 1");
			System.out.println("Line 2");

			if(i == 6)
			break block1;

			System.out.println("after break");
		}
		System.out.println("=========================================");

		System.out.println(i + "" +getN(6));



	}

	public static int getN(int h){
		System.out.println("Insire SOP" + h);
		return h;
	}
}