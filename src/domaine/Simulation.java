package domaine;

/**
 * Une classe abstraite qui permet de tester l'�ligibilit� � un cr�dit Conso ou
un cr�dit Immo
 * 
 * @author Badr
 *
 */
public abstract class Simulation {
	/**
	 * id Num�ro de simulation
	 */
	private int id;
	/**
	 * Montatnt du pr�t
	 */
	protected double montant;
	/**
	 * Dur�e de remboursement en Mois
	 */
	protected String duree;
	/**
	 * Taux d'int�r�t du pr�t
	 */
	protected double taux;
	/**
	 * constructeur sans param�tres
	 */
	public Simulation() {
		super();
	}
	/**
	 * constructeur avec tous les attributs
	 * @param id  Num�ro de simulation
	 * @param montant Montatnt du pr�t
	 * @param date Dur�e de remboursement en Mois
	 * @param taux Taux d'int�r�t du pr�t
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
	 * M�thode to string 
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Simulation [id=" + id + ", montant=" + montant + ", duree=" + duree + ", taux=" + taux + "]";
	}
	
	
	
	

}
