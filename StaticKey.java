class StaticKey {
	static int a = 5;
	static int b = 6;

	public static void main(String[] args) {
		StaticKey sk = new StaticKey();
		System.out.println(sk.a);
		System.out.println(sk.b);

		System.out.println("Null!");
		sk=null;
		System.out.println(sk.a);
		System.out.println(sk.b);    //Static variable calling
	}
}