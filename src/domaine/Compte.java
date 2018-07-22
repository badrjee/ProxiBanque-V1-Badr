/**
 * 
 */
package domaine;

/**
 * Classe correspondant aux objets de type Compte.
 * @author Arnaud
 *
 */
public abstract class Compte {
	
	private int id;
	protected double solde;
	protected String dateOuverture;
	protected Client proprietaire;
	
	
	//CONSTRUCTEUR
	/**
	 * Constructeur par défaut
	 */
	public Compte() {
		super();
	}

	/**
	 * Constructeur avec tous les attributs.
	 * @param id id correspond à l'identifiant du compte
	 * @param solde solde correspond au Solde du compte
	 * @param dateOuverture date d'ouverture du compte
	 */
	public Compte(int id, double solde, String dateOuverture) {
		super();
		this.id = id;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}


	//------GETTERS AND SETTERS------
	/**
	 * getter et setter
	 */
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
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}


	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}


	/**
	 * @return the dateOuverture
	 */
	public String getDateOuverture() {
		return dateOuverture;
	}


	/**
	 * @param dateOuverture the dateOuverture to set
	 */
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}


	/**
	 * @return the proprietaire
	 */
	public Client getProprietaire() {
		return proprietaire;
	}


	/**
	 * @param proprietaire the proprietaire to set
	 */
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	/**
	 * Méthode to String
	 */
	
	//TO STRING
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte [id=" + id + ", solde=" + solde + ", dateOuverture=" + dateOuverture + "]";
	}
}
