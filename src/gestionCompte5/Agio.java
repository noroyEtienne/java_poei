package gestionCompte5;

/**
 * Manages the retrait class.
 * 
 * @author Etienne NOROY
 *
 */
public class Agio extends Mouvement {

	public Agio(int montant) {
		super(montant);
	}
	
	/**
	 * Gets the amount of the withdrawal.
	 */
	@Override
	public int getMoins() {
		return getMontant();
	}
	
	/**
	 * Displays the definition of the instance as a string.
	 */
	@Override
	public String toString() {
		return "Retrait [getMoins()=" + getMoins() + "]";
	}
}
