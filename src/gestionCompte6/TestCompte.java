package gestionCompte6;

/**
 * 
 * Tests the usage of the Compte class.
 * 
 * @author Etienne NOROY
 *
 */
public class TestCompte {
		
	/**
	 * The decouvert.
	 */
	private static final int DECOUVERT = 100;
	
	/**
	 * The decouvert.
	 */
	private static final int AGIO_PRICE = 5;
	
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
	 * @throws CompteException 
	 */
	public static void main(String[] args) throws CompteException {
		
		Compte compte1 = new Compte();
		
		Compte compte2 = new Compte(DECOUVERT);
		
		System.out.println("Découvert compte 1 :" + compte1.getDecouvert());
		System.out.println("Découvert compte 2 :" + compte2.getDecouvert());
		
		displayTestCompte("compte1", compte1);
		displayTestCompte("compte2", compte2);
		
		compte1.retraitDe(200);

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
		
		displayTestResult(sb, "Solde actuel : ", compte.getSolde());
		
		for (int i = 0; i < DEPOT_ARRAY.length; i++) {
			
			// Test the deposit method.
			displayTitle("Deposit");
			displayTestResult(sb, "Depot de : ", DEPOT_ARRAY[i]);
			compte.depotDe(DEPOT_ARRAY[i]);
			
			// Test the getSommeDepots method.
			displayTestResult(sb, "Somme des dépots : ", compte.getSommeDepots());
			
			// Test the getSolde method.
			displayTestResult(sb, "Solde actuel : ", compte.getSolde());	
			
			// Test the withdrawal method.
			displayTitle("Retrait");
			displayTestResult(sb, "Retrait de : ", RETRAIT_ARRAY[i]);
			
			// Test the verifDecouvert / retraitDe methods.
			try 
			{
				compte.retraitDe(RETRAIT_ARRAY[i]);
				System.out.println("Retrait effectué !");
			}
			catch(CompteException ex) 
			{
				System.out.println(ex.getMessage());
			}		
			
			// Test the getSommeRetraits method.
			displayTestResult(sb, "Somme des retraits : ", compte.getSommeRetraits());
			
			// Test the getSolde method.
			displayTestResult(sb, "Solde actuel : ", compte.getSolde());	
		}
		
		// Test the agioPayement method.
		displayTestResult(sb, "Payement agio : ", AGIO_PRICE);
		compte.agioPaiement(AGIO_PRICE);
		
		//Test the getHistorique method.
		displayTitle("Historique");
		System.out.println(compte.getHistorique());
		System.out.println("Solde : " + compte.getSolde());
	}
	
	/**
	 * 
	 * @param sb the string builder
	 * @param message the message
	 * @param result the result to display
	 */
	private static void displayTestResult(StringBuilder sb, String message, int result) {
		sb.append(message)
		.append(result);
		System.out.println(sb.toString());
		sb.setLength(0);
	}

}
