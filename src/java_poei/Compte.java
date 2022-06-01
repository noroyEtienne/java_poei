package java_poei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Manages the class Compte.
 * @author Etienne NOROY
 *
 */
public class Compte implements Comparable<Compte>{

	/**
	 * The solde of the account.
	 */
	public int solde;
	
	/**
	 * Initializes an instance of the class Compte.
	 * 
	 * @param solde the sodle.
	 */
	public Compte(int solde) {
		this.solde = solde;
	}

	/**
	 * Gets the solde.
	 * 
	 * @return the solde
	 */
	public int getSolde() {
		return solde;
	}

	/**
	 * Overrides the method compareTo.
	 */
	@Override
	public int compareTo(Compte o) {
		
		return solde - o.solde;
	}

	/**
	 * Overrides the method toString.
	 */
	@Override
	public String toString() {
		return "Compte [solde=" + solde + "]";
	}
	
	/**
	 * Executes the demo.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		List<Compte> liste = new ArrayList<Compte>();
		
		liste.add(new Compte(100));
		liste.add(new Compte(50));
		liste.add(new Compte(75));
		
		Collections.sort(liste);
		
		System.out.println(liste); 
	}		
}
