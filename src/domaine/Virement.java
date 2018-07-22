package domaine;

/**
 * La classe de virement gère les virements d'un compte à compte.
 * @author Badr
 *
 */

public class Virement {
	
	/**
	 * identifiant du virement pour pouvoir tenir un historique des virements dans les comptes
	 */
	private int id;
	/**
	 * Montant du virement effectué
	 */
	private double montant;
	/**
	 * Date où le virement a été effectué
	 */
	private String dateVirement;
	/**
	 * Message saisi par le conseiller pour expliquer la raison de cette opération. 
	 */
	private String description;
	
	//CONSTRUCTOR
	/**
	 * @param id identifiant du virement pour pouvoir tenir un historique des virements dans les comptes
	 * @param montant Montant du virement effectué
	 * @param dateVirement Date où le virement a été effectué
	 * @param description Message saisi par le conseiller pour expliquer la raison de cette opération. 
	 */
	public Virement(int id, double montant, String dateVirement, String description) {
		super();
		this.id = id;
		this.montant = montant;
		this.dateVirement = dateVirement;
		this.description = description;
	}

	/**
	 * Constructeur par défaut
	 */
	public Virement() {
		super();
		
	}
	
	//GETTER AND SETTER

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * @return the dateVirement
	 */
	public String getDateVirement() {
		return dateVirement;
	}

	/**
	 * @param dateVirement the dateVirement to set
	 */
	public void setDateVirement(String dateVirement) {
		this.dateVirement = dateVirement;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Méthode to string
	 */

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Virement [id=" + id + ", montant=" + montant + ", dateVirement=" + dateVirement + ", description="
				+ description + "]";
	}
	
		
	
}
