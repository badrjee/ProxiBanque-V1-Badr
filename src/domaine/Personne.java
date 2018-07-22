/**
 * 
 */
package domaine;

/**
 * La classe abstraite personne, c'est la classe mère de client, conseiller, gérant
 * @author Badr
 *
 */
public abstract class Personne {
	/**
	 * Identifiant personne
	 */
	private int id;
	/**
	 * Nom personne
	 */
	protected String nom;
	/**
	 * Prénom personne
	 */
	protected String prenom;
	
	/**
	 * consructeur avec paramètres
	 * @param id Identifiant personne
	 * @param nom Nom personne
	 * @param prenom Prénom personne
	 */
	public Personne(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * consturcteur sans paramètres
	 */
	public Personne() {
		super();
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Méthode toString
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}


}
