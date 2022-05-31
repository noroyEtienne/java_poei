package gestionCompte51;

/**
 * Manages the retrait class.
 * 
 * @author Etienne NOROY
 *
 */
public class Retrait extends Mouvement {

	public Retrait(int montant) {
		super(montant);
	}

	/**
	 * Gets the amount of the withdrawal
	 */
	@Override
	public int getMoins() {
		return getMontant();
	}

}
