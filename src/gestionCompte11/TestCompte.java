package gestionCompte11;

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
	private static final int SOLDE_INIT = 100;
	
	
	/**
	 * The array of deposit.
	 */
	private static final int[] DEPOT_ARRAY = {10, 20, 30, 0};
	
	/**
	 * The array of deposit.
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
		sb.append("Solde initiale : ")
		.append(SOLDE_INIT);
		
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
			System.out.println("Solde actuel : " + compte.solde);
			
			// Test the withdrawal method.
			displayTitle("Retrait");
			sb.append("Retrait de : ")
			.append(RETRAIT_ARRAY[i]);
			compte.retraitDe(RETRAIT_ARRAY[i]);
			System.out.println(sb.toString());
			sb.setLength(0);
			System.out.println("Solde actuel : " + compte.solde);
			
			// Test the getSolde method.
			displayTitle("GetSolde");
			int getSolde = compte.getSolde();
			System.out.println("Solde actuel : " + getSolde);
			
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
