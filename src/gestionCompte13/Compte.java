package gestionCompte13;

/**
 * Manages the class Compte.
 * @author Etienne NOROY
 *
 */
public class Compte {

	/**
	 * The sum of the deposit.
	 */
	private int sommeDepots;
	
	/**
	 * The sum of the withdrawal.
	 */
	private int sommeRetraits;
	
	/**
	 * Initializes an instance of the class Compte.
	 * 
	 */
	public Compte() {
	}
	
	/**
	 * Adds the montant to the solde.
	 * 
	 * @param montant the montant
	 */
	public void depotDe(int montant) {
		sommeDepots += montant;		
	}
	
	/**
	 * Substracted the montant to the solde
	 * 
	 * @param montant the montant substrate.
	 */
	public void retraitDe(int montant) {
		sommeRetraits += montant;	
	}

	/**
	 * Gets the sum of the deposits.
	 * 
	 * @return the sommeDepots
	 */
	public int getSommeDepots() {
		return sommeDepots;
	}

	/**
	 * Gets the sum of the withdrawals.
	 * 
	 * @return the sommeRetraits
	 */
	public int getSommeRetraits() {
		return sommeRetraits;
	}
	
	/**
	 * Gets the solde.
	 * 
	 * @return the solde
	 */
	public int getSolde() {
		return sommeDepots - sommeRetraits;
	}

	
	
}
