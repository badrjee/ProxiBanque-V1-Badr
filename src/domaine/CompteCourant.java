package domaine;

/**
 * Le Compte Courant est un compte spécifique avec une autorisation de découvert.
 * @author Arnaud
 *
 */
public class CompteCourant extends Compte {
	
	/**
	 * Decouvert autorisé sur ce compte.
	 */
	private double decouvert = 1000;
	
	//CONSTRUCTEUR
	
	/**
	 * Constructeur par défaut
	 */
	public CompteCourant() {
		super();
	}


	/**
	 *  Constructeur avec tous les attributs
	 * @param id identifiant du compte
	 * @param solde solde du compte
	 * @param dateOuverture date d'ouverture du compte
	 * @param decouvert Decouvert autorisé sur ce compte.
	 */
	
	public CompteCourant(int id, double solde, String dateOuverture, double decouvert) {
		super(id, solde, dateOuverture);
		this.decouvert = decouvert;
	}

	//GETTER AND SETTER
	/**
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}


	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/**
	 * Méthode to string
	 */
	//TO STRING
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteCourant [id=" + super.getId() + ", solde=" + super.getSolde() + ", dateOuverture=" + super.getDateOuverture() + " decouvert=" + decouvert + "]";
	}
	
		
	
}
