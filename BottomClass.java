class BottomClass {
	int i;
	public static void main(String[] args) {
		InHer in = new Inher2();
		// in.Disp();
		Inher2 in2 = (Inher2) in;
		// in2.Disp();
		InHer inh = new InHer();

		in.Disp();
		in.Disp("String");
		in2.Disp();
		in2.Disp("String");
		inh.Disp();
		inh.Disp("Hello");
	
		// this.i=0;	//Non-Static stuff can't be accessed using from a static context using 'this'.
	}
	
}