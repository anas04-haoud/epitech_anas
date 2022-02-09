package epitech_test;

public class Mage extends Character{
	
	String RGPClass = "Mage";
	int life = 70;
	int agility = 10;
	int strength = 3;
	int wit = 10;
	
	public Mage(String nameArg) {
		name = nameArg;
		System.out.println(name+": May the gods be with me");
	}
	
	public void attack(String weapon) {
		if(weapon.equals("magic") || weapon.equals("wand")) {
			System.out.println(name+": Rrrrrrrr....");
			System.out.println(name+": Fell the power of my " + weapon + "!");
		}
	}
	
	public void moveRight() {
		System.out.println(name+": moves right");
	}
	public void moveLeft() {
		System.out.println(name+": moves left");
	}
	public void moveForward() {
		System.out.println(name+": moves back");
	}
	public void moveBack() {
		System.out.println(name+": moves forward");
	}

}
