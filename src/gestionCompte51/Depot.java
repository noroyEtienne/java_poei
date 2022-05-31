package gestionCompte51;

/**
 * Manages the retrait class.
 * 
 * @author Etienne NOROY
 *
 */
public class Depot extends Mouvement {

	public Depot(int montant) {
		super(montant);
	}
	
	/**
	 * Gets the amount of the deposit.
	 */
	@Override
	public int getPlus() {
		return getMontant();
	}
	

}
