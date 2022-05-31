package gestionCompte20;

/**
 * Manages the class Compte.
 * @author Etienne NOROY
 *
 */
public class Compte {

	/**
	 * The array of the deposit.
	 */
	private int[] depots;
	
	/**
	 * The array of the withdrawal.
	 */
	private int[] retraits;
	
	/**
	 * The overdraft.
	 */
	private int decouvert;
	
	/**
	 * The last index of the deposit array.
	 */
	private int iDepots;
	
	/**
	 * The last index of the withdrawal array.
	 */
	private int iRetraits;
	
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
			System.out.println(retraitDe(solde)? "Solde initial accepté" : "Solde initial refusé");
			
		}
		else {
			depotDe(solde);
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
		depots[iDepots] = montant;		
	}
	
	/**
	 * Substracted the montant to the solde
	 * 
	 * @param montant the montant substrate.
	 */
	public boolean retraitDe(int montant) {
		
		if(verifDecouvert(montant)) {
			retraits[iRetraits] = montant;	
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
		
		int sum = 0;
		
		for (int i = 0; i < depots.length; i++) {
			
			sum += depots[i];
		}
		
		return sum;
	}

	/**
	 * Gets the sum of the withdrawals.
	 * 
	 * @return the sommeRetraits
	 */
	public int getSommeRetraits() {
		
		int sum = 0;
				
		for (int i = 0; i < retraits.length; i++) {
					
			sum += retraits[i];
		}
				
		return sum;	
	}
	
	/**
	 * Gets the solde.
	 * 
	 * @return the solde
	 */
	public int getSolde() {
		return getSommeDepots() - getSommeRetraits();
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
		
		if (this.getSolde() - montant >= -this.decouvert) {
			
			return false;
		}
		
		return true;
	}
	
	
}
