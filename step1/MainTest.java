package epitech_test;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character perso = new TesterCharacter ( "Jean - Luc" ) ;
		System.out.println ( perso.getName () ) ;
		System.out.println ( perso.getLife () ) ;
		System.out.println ( perso.getAgility () ) ;
		System.out.println ( perso.getStrength () ) ;
		System.out.println ( perso.getWit () ) ;
		System.out.println ( perso.getRPGClass () ) ;
		perso.attack ( " my weapon " );

	}

}
