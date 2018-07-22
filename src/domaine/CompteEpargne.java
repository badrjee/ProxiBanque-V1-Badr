package domaine;

/**
 * Classe CompteEpargne est un Compte ayant un taux de rémunération.
 * 
 * @author Badr
 *
 */
public class CompteEpargne extends Compte {
	/**
	 * Taux d'intérêt définis par défaut .
	 */
	private double taux = 0.03;

	// CONSTRUCTEUR

	/**
	 * Constructeur par défaut
	 */
	public CompteEpargne() {
		super();
	}

	/**
	 * Constructeur avec tous les attributs
	 * @param id Identifiant du compte
	 * @param solde Solde du compte
	 * @param dateOuverture Date d'ouverture du compte
	 * @param taux Taux d'intérêt d'épargne
	 */
	public CompteEpargne(int id, double solde, String dateOuverture, double taux) {
		super(id, solde, dateOuverture);
		this.taux = taux;
	}

	// GETTER AND SETTER
	
	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * @param taux
	 *            the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	// TO STRING
	/**
	 *Méthode to string
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteEpargne [id=" + super.getId() + ", solde=" + super.getSolde() + ", dateOuverture="
				+ super.getDateOuverture() + " taux=" + taux + "]";
	}

}
