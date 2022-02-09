package epitech_test;

public class Warrior extends Character{
	
	String RGPClass = "Warrior";
	int life = 100;
	int agility = 8;
	int strength = 10;
	int wit = 3;
	
	public Warrior(String nameArg) {
		name = nameArg;
		System.out.println(name+": My name will go down in history !");
	}
	
	public void attack(String weapon) {
		if(weapon.equals("hammer") || weapon.equals("sword")) {
			System.out.println(name+": Rrrrrrrr....");
			System.out.println(name+": I'll crush you with my " + weapon + "!");
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
