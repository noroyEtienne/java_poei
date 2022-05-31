package gestionCompte14;

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
	 * The overdraft.
	 */
	private int decouvert;
	
	/**
	 * Initializes an instance of the class Compte.
	 * 
	 * @param solde the solde.
	 * 
	 */
	public Compte() {
		this.decouvert = 0;
	}
	
	/**
	 * Initializes an instance of the class Compte.
	 * 
	 * @param solde the solde.
	 * 
	 */
	public Compte(int solde) {
		this();
		
		if( solde < 0) {
			System.out.println(verifDecouvert(solde)? "Solde initial accepté" : "Solde initial refusé");
			
		}
		else {
			sommeDepots += solde;
		}
	}
	
	/**
	 * Initializes an instance of the class Compte.
	 * 
	 */
	public Compte(int solde, int decouvert) {
		this(solde);
		this.decouvert = decouvert;
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
	public boolean retraitDe(int montant) {
		
		if(verifDecouvert(montant)) {
			sommeRetraits += montant;
			return true;
		}
		
		return false;
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

	/**
	 * Gets the overdraft.
	 * 
	 * @return the decouvert
	 */
	public int getDecouvert() {
		return decouvert;
	}
	
	/**
	 * Sets the overdraft.
	 * 
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}
	
	/**
	 * Verifies the overdraft.
	 * 
	 * @param montant the montant to check
	 * @return true if the withdrawal is possible otherwise false
	 */
	private boolean verifDecouvert(int montant) {
		
		if ((this.getSolde() - montant) < - this.decouvert) {
			
			return false;
		}
		
		return true;
	}
	
	
}
