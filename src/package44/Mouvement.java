package package44;

import java.util.Date;

/**
 * 
 * Manages the Mouvement class.
 * 
 * @author Etienne NOROY
 *
 */
public class Mouvement {

	/**
	 * The amount of the mouvement
	 */
	private int montantMvt;
	
	/**
	 * The date of the mouvement
	 */
	private Date dateMvt;
	
	/**
	 * 
	 * Initializes an instance of the class Mouvement.
	 * 
	 * @param montant the amount
	 * @param typeMvt the type of mouvement
	 */
	public Mouvement(int montant) {
		
		this.montantMvt = montant;
		this.dateMvt = new Date();
	}
	
	/**
	 * Gets the amount of the deposits.
	 * 
	 * @return the sum of the deposit
	 */
	public int getPlus() {
		return 0;
	}
	
	/**
	 * Gets the amount of the withdrawals.
	 * 
	 * @return the sum of the withdrawal
	 */
	public int getMoins() {
		return 0;
	}

	/**
	 * Gets the montant.
	 * 
	 * @return the montant
	 */
	public int getMontant() {
		return montantMvt;
	}

	/**
	 * Sets the montant.
	 * 
	 * @param montant the montant to set
	 */
	public void setMontant(int montant) {
		this.montantMvt = montant;
	}

	/**
	 * Gets the date of the mouvement.
	 * 
	 * @return the dateMvt
	 */
	public Date getDateMvt() {
		return dateMvt;
	}

	/**
	 * Sets the date of the mouvement.
	 * 
	 * @param dateMvt the dateMvt to set
	 */
	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}
}

