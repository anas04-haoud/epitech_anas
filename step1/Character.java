package epitech_test;

public abstract class Character {

	protected String name;
	protected final String RGPClass = "Character";
	protected int life = 50;
	protected int agility = 2;
	protected int strength = 2;
	protected int wit = 2;
	
	public String getName() {
		return name;
	}
	
	public int getLife() {
		return life;
	}
	
	public int getAgility() {
		return agility;
	}
	
	public int getStrength() {
		return agility;
	}
	
	public int getWit() {
		return wit;
	}
	
	public String getRPGClass() {
		return RGPClass;
	}
	
	public void attack(String something) {
		System.out.println(name+": " + something);
	}

}
