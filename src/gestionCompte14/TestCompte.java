package gestionCompte14;

/**
 * 
 * Tests the usage of the Compte class.
 * 
 * @author Etienne NOROY
 *
 */
public class TestCompte {
	
	/**
	 * The solde.
	 */
	private static final int SOLDE1 = -20;
	
	/**
	 * The solde.
	 */
	private static final int SOLDE2 = 50;
	
	/**
	 * The decouvert.
	 */
	private static final int DECOUVERT = -100;
	
	/**
	 * The array of deposit.
	 */
	private static final int[] DEPOT_ARRAY = {10, 20, 30, 0, 10};
	
	/**
	 * The array of withdrawal.
	 */
	private static final int[] RETRAIT_ARRAY = {10, 0, 50, 20, 120};

	/**
	 * Executes the test.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Compte compte1 = new Compte(SOLDE1);
		
		Compte compte2 = new Compte(SOLDE2, DECOUVERT);
		
		System.out.println("Découvert compte 1 :" + compte1.getDecouvert());
		System.out.println("Découvert compte 2 :" + compte2.getDecouvert());
		
		displayTestCompte("compte1", compte1);
		displayTestCompte("compte2", compte2);

	}
	
	/**
	 * Displays a title.
	 * 
	 * @param title the title to display.
	 */
	private static void displayTitle(String title) {
		System.out.println("**********" + title + "**********");
	}
	
	/**
	 * Displays the units tests about Compte.
	 * 
	 * @param compteName the name of the compte
	 * @param compte
	 */
	private static void displayTestCompte(String compteName, Compte compte) {
		
		StringBuilder sb = new StringBuilder(30);

		System.out.println(System.lineSeparator());
		displayTitle(compteName);
		System.out.println(System.lineSeparator());
		
		sb.append("Solde actuel : ")
		.append(compte.getSolde());
		System.out.println(sb.toString());
		sb.setLength(0);
		
		for (int i = 0; i < DEPOT_ARRAY.length; i++) {
			
			// Test the deposit method.
			displayTitle("Deposit");
			sb.append("Depot de : ")
			.append(DEPOT_ARRAY[i]);
			compte.depotDe(DEPOT_ARRAY[i]);
			System.out.println(sb.toString());
			sb.setLength(0);
			
			// Test the getSommeDepots method.
			sb.append("Somme des dépots : ")
			.append(compte.getSommeDepots());
			System.out.println(sb.toString());
			sb.setLength(0);
			
			// Test the getSolde method.
			sb.append("Solde actuel : ")
			.append(compte.getSolde());
			System.out.println(sb.toString());
			sb.setLength(0);
			
			// Test the withdrawal method.
			displayTitle("Retrait");
			sb.append("Retrait de : ")
			.append(RETRAIT_ARRAY[i]);
			System.out.println(sb.toString());
			boolean check = compte.retraitDe(RETRAIT_ARRAY[i]);
			
			// Test the verifDecouvert method.
			System.out.println(check? "Retrait effectué !" : "Le retrait n'a pas été possible !");
			sb.setLength(0);
			
			// Test the getSommeRetraits method.
			sb.append("Somme des retraits : ")
			.append(compte.getSommeRetraits());
			System.out.println(sb.toString());
			sb.setLength(0);
			
			// Test the getSolde method.
			sb.append("Solde actuel : ")
			.append(compte.getSolde());
			System.out.println(sb.toString());
			sb.setLength(0);		
		}
	}

}
