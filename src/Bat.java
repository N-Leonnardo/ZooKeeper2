
public class Bat extends Mammal{
	public int energy = 300;
	
	public String fly() {
		this.energy -= 50;
		return "Tututututu, -50 energy!";
		
	}
	
	public String eatHumans() {
		this.energy += 25;
		return "RIP";
		
	}
	
	public String attackTown() {
		this.energy -= 100;
		return "uiuiuiui! aaaaa! boom! craaack!";
		
	}
}
