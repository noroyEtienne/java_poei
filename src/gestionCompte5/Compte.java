package gestionCompte5;

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
	private List<Mouvement> historique;
	
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
		historique = new ArrayList<Mouvement>();
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
		historique.add(new Depot(montant));
	}
	
	/**
	 * Substracted the montant to the solde
	 * 
	 * @param montant the montant substrate.
	 */
	public boolean retraitDe(int montant) {
		
		if(verifDecouvert(montant)) {
			historique.add(new Retrait(montant));
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
		
		Iterator<Mouvement> itr = historique.iterator();
		
		while(itr.hasNext()) {

			sum += itr.next().getPlus();
			
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
		
		Iterator<Mouvement> itr = historique.iterator();
		
		while(itr.hasNext()) {

			sum += itr.next().getMoins();
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
	
	/**
	 * Displays the definition of the instance as a string.
	 */
	@Override
	public String toString() {
		return "Compte [historique=" + historique + ", decouvert=" + decouvert + ", getSommeDepots()="
				+ getSommeDepots() + ", getSommeRetraits()=" + getSommeRetraits() + ", getSolde()=" + getSolde()
				+ ", getDecouvert()=" + getDecouvert() + "]";
	}
	
	/**
	 * Gets the historique as a string.
	 * 
	 * @return the historique of the movements
	 */
	public String getHistorique() {
		
		StringBuilder sb = new StringBuilder(100);
		
		for(Mouvement movement : historique) {
			if (movement.getMontant() != 0) {
				sb.append(movement.getDateMvt().toString())
				.append(" : ")
				.append(movement.getClass().getSimpleName())
				.append(" - ")
				.append(movement.getMontant())
				.append("\n");
			}
		}
		
		return sb.toString();
	}
}