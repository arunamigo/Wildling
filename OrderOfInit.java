class OrderOfInit {

	static {add(2);}
	static void add(int num){	System.out.println(num+ " "); }
	static {add(4);}

	{add(6);}
	OrderOfInit(){add(8);}
public static void main(String[] args) {
	new OrderOfInit();
}

}