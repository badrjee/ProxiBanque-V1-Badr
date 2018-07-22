package domaine;

/**
 * Classe qui correspond au Carte Bancaire et classe mère de tous les classes CB
 * 
 * @author Badr
 *
 */
public abstract class CB {

	// ATTRIBUTS
	private int id;
	protected int code;
	protected Client proprietaire;

	// CONSTRUCTEUR
	/**
	 * Constructeur par défaut
	 */
	public CB() {
		super();
	}

	/**
	 * Constructeur avec paramètres
	 * 
	 * @param id  c'est le numéro de la CB
	 * @param code C'est le code de la CB composé de 4 chiffres.
	 * @param proprietaire le proprietaire de la carte est de type Client
	 */
	public CB(int id, int code, Client proprietaire) {
		super();
		this.id = id;
		this.code = code;
		this.proprietaire = proprietaire;
	}

	// GETTER AND SETTER
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
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the proprietaire
	 */
	public Client getProprietaire() {
		return proprietaire;
	}

	/**
	 * @param proprietaire
	 *            the proprietaire to set
	 */
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	/**
	 * Méthode to String
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CB [id=" + id + ", code=" + code + ", proprietaire=" + proprietaire + "]";
	}

}
