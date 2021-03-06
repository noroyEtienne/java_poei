package gestionCompte13;

/**
 * 
 * Tests the usage of the Compte class.
 * 
 * @author Etienne NOROY
 *
 */
public class TestCompte {
	
	/**
	 * The solde at the initiatiation.
	 */
	private static final int SOLDE_INIT = 0;
	
	/**
	 * The array of deposit.
	 */
	private static final int[] DEPOT_ARRAY = {10, 20, 30, 0};
	
	/**
	 * The array of withdrawal.
	 */
	private static final int[] RETRAIT_ARRAY = {10, 0, 50, 20};

	/**
	 * Executes the test.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Compte compte = new Compte(SOLDE_INIT);
		
		StringBuilder sb = new StringBuilder();

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
			compte.retraitDe(RETRAIT_ARRAY[i]);
			System.out.println(sb.toString());
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
	
	/**
	 * Displays a title.
	 * 
	 * @param title the title to display.
	 */
	public static void displayTitle(String title) {
		System.out.println("**********" + title + "**********");
	}

}
