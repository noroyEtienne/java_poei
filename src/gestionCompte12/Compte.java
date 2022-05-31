package gestionCompte12;

/**
 * Manages the class Compte.
 * @author Etienne NOROY
 *
 */
public class Compte {

	/**
	 * The solde of the account.
	 */
	private int solde;
	
	/**
	 * Initializes an instance of the class Compte.
	 * 
	 * @param solde the solde.
	 */
	public Compte(int solde) {
		this.solde = solde;
	}
	
	/**
	 * Adds the montant to the solde.
	 * 
	 * @param montant the montant
	 */
	public void depotDe(int montant) {
		solde += montant;		
	}
	
	/**
	 * Substracted the montant to the solde
	 * 
	 * @param montant the montant substrate.
	 */
	public void retraitDe(int montant) {
		solde -= montant;	
	}

	/**
	 * Gets the solde.
	 * 
	 * @return the solde
	 */
	public int getSolde() {
		return solde;
	}
	
	
}
