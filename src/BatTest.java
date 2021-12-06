
public class BatTest {

	public static void main(String[] args) {
		Bat b = new Bat();
		
		b.fly();
		b.eatHumans();
		b.attackTown();
		
		System.out.println(b.energy);
		
		
		b.eatHumans();
		b.eatHumans();
		b.eatHumans();
		b.eatHumans();
		b.eatHumans();
		b.eatHumans();
		b.eatHumans();
		System.out.println(b.energy);
	}

}
