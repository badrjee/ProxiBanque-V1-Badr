package domaine;

/**
 * Une classe abstraite qui permet de tester l'éligibilité à un crédit Conso ou
un crédit Immo
 * 
 * @author Badr
 *
 */
public abstract class Simulation {
	/**
	 * id Numéro de simulation
	 */
	private int id;
	/**
	 * Montatnt du prêt
	 */
	protected double montant;
	/**
	 * Durée de remboursement en Mois
	 */
	protected String duree;
	/**
	 * Taux d'intérêt du prêt
	 */
	protected double taux;
	/**
	 * constructeur sans paramètres
	 */
	public Simulation() {
		super();
	}
	/**
	 * constructeur avec tous les attributs
	 * @param id  Numéro de simulation
	 * @param montant Montatnt du prêt
	 * @param date Durée de remboursement en Mois
	 * @param taux Taux d'intérêt du prêt
	 */
	public Simulation(int id, double montant, String date, double taux) {
		super();
		this.id = id;
		this.montant = montant;
		this.duree = duree;
		this.taux = taux;
	}
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
	 * @return the date
	 */
	public String getDuree() {
		return duree;
	}
	/** 
	 * @param duree the dree to set
	 */
	public void setDuree(String duree) {
		this.duree = duree;
	}
	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}
	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	/**
	 * Méthode to string 
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Simulation [id=" + id + ", montant=" + montant + ", duree=" + duree + ", taux=" + taux + "]";
	}
	
	
	
	

}
