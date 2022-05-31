package gestionCompte42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Manages the class Compte.
 * @author Etienne NOROY
 *
 */
public class Compte {

	/**
	 * The list of the mouvements.
	 */
	private List<Mouvement> mouvements;
	
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
		decouvert = 0;
		mouvements = new ArrayList<Mouvement>();
	}
	
	/**
	 * Initializes an instance of the class Compte.
	 * 
	 * @param solde the solde.
	 * 
	 */
	public Compte(int decouvert) {
		this();
		
		this.decouvert = decouvert;
	}
	
	/**
	 * Adds the montant to the solde.
	 * 
	 * @param montant the montant
	 */
	public void depotDe(int montant) {
		mouvements.add(new Mouvement(montant, TypeMvt.DEPOT));
	}
	
	/**
	 * Substracted the montant to the solde
	 * 
	 * @param montant the montant substrate.
	 */
	public boolean retraitDe(int montant) {
		
		if(verifDecouvert(montant)) {
			mouvements.add(new Mouvement(montant, TypeMvt.RETRAIT));
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
		
		Iterator<Mouvement> itr = mouvements.iterator();
		
		while(itr.hasNext()) {
			
			Mouvement mvt = itr.next();
			
			if (mvt.getTypeMvt() == TypeMvt.DEPOT) {
				sum += mvt.getMontant();
			}
			
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
		
		Iterator<Mouvement> itr = mouvements.iterator();
		
		while(itr.hasNext()) {
			
			Mouvement mvt = itr.next();
			
			if (mvt.getTypeMvt() == TypeMvt.RETRAIT) {
				sum += mvt.getMontant();
			}
			
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
			
			return true;
		}
		
		return false;
	}	
}