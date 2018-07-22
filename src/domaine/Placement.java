/**
 * 
 */
package domaine;

/**
 * Classement permettant au conseiller de créer des placements.
 * @author Arnaud
 *
 */
public class Placement {
	/**
	 * Identifiant du placement.
	 */
	private int id;
	/**
	 * Montant du placement.
	 */
	private Double montant;
	/**
	 * Taux de rémunération du placement.
	 */
	private Double taux;
	/**
	 * Duree en mois
	 */
	private int duree;
	/**
	 * Choix de la place Boursière Paris, New-York et Tokyo.
	 */
	private String bourse;
	
	
	/**
	 * @param id Identifiant du placement.
	 * @param montant Montant du placement.
	 * @param taux Taux d'intérêt du placement.
	 * @param duree Durée du placement en mois
	 * @param bourse Choix de la place Boursière Paris, New-York et Tokyo.
	 */
	public Placement(int id, Double montant, Double taux, int duree, String bourse) {
		super();
		this.id = id;
		this.montant = montant;
		this.taux = taux;
		this.duree = duree;
		this.bourse = bourse;
	}


	/**
	 * Constructeur par défaut.
	 */
	public Placement() {
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
	 * @return the taux
	 */
	public Double getTaux() {
		return taux;
	}


	/**
	 * @param taux the taux to set
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}


	/**
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}


	/**
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}


	/**
	 * @return the bourse
	 */
	public String getBourse() {
		return bourse;
	}


	/**
	 * @param bourse the bourse to set
	 */
	public void setBourse(String bourse) {
		this.bourse = bourse;
	}
	

	/**
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}


	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}


	//TO STRING
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Placement [id=" + id + ", montant=" + montant + ", taux=" + taux + ", duree=" + duree + ", bourse="
				+ bourse + "]";
	}

	
}
