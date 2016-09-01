class  Game{
	public void play(){
		System.out.println("Play in Game");
	}
	public void play1(String s){
		System.out.println("Play in Game");
	}
}

class Soccer extends Game {
	public void play1(String s){
		System.out.println("Play in Soccer");
	}
}

public class TestSoccer {
	public static void main(String[] args) {
		
	
	Game g = new Soccer();
	g.play1("Hello");

	Soccer soc = (Soccer) g;
	soc.play1("Hello2");
}
}