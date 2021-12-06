
public class Gorilla extends Mammal {
	
	public String throwSomething() {
		this.energy -= 5;
		return "Gorila threw something, -5 energy!";
	}
	
	public String eatBananas() {
		this.energy += 10;
		return "Gorila ate a banana, +10 energy!";
		
	}
	
	public String climb() {
		this.energy -= 10;
		return "Gorila climb, -10 energy!";
	}
	
}
