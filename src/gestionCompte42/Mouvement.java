package gestionCompte42;

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
	private int montant;
	
	/**
	 * The date of the mouvement
	 */
	private Date dateMvt;
	
	/**
	 * The type of the mouvement
	 */
	private TypeMvt typeMvt;
	
	/**
	 * 
	 * Initializes an instance of the class Mouvement.
	 * 
	 * @param montant the amount
	 * @param typeMvt the type of mouvement
	 */
	public Mouvement(int montant, TypeMvt typeMvt) {
		
		this.montant = montant;
		this.typeMvt = typeMvt;
		dateMvt = new Date();
	}

	/**
	 * Gets the montant.
	 * 
	 * @return the montant
	 */
	public int getMontant() {
		return montant;
	}

	/**
	 * Sets the montant.
	 * 
	 * @param montant the montant to set
	 */
	public void setMontant(int montant) {
		this.montant = montant;
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

	/**
	 * Gets the type of the mouvement.
	 * 
	 * @return the typeMvt
	 */
	public TypeMvt getTypeMvt() {
		return typeMvt;
	}

	/**
	 * Sets the type of the mouvement.
	 * 
	 * @param typeMvt the typeMvt to set
	 */
	public void setTypeMvt(TypeMvt typeMvt) {
		this.typeMvt = typeMvt;
	}
}

