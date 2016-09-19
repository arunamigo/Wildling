public class Animal {

	public Animal(String name, boolean hopper, boolean swimmer, boolean hunter){
		this.species = name;
		this.canHop = hopper;
		this.canSwim = swimmer;
		this.canHunt = hunter;
	}

	public String species;
	public boolean canHop;
	public boolean canSwim;
	public boolean canHunt;

	public String toString(){
		return species;
	}
	public boolean isHopper(){
		return canHop;
	}
	public boolean isSwimmer(){
		return canSwim;
	}
	public boolean isHunter(){
		return canHunt;
	}
}