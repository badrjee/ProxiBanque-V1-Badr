package domaine;

public class Gerant extends Personne {
	/**
	 * L'Agence est géré et auditer par le gérant.
	 */
	private Agence agence;

	/**
	 * Constructeur avec paramètres
	 * @param id Identifiant du gérant
	 * @param nom Nom gerant
	 * @param prenom Prenom du  gérant
	 * @param agence l'objet Agence de type agence
	 */
	
	public Gerant(int id, String nom, String prenom, Agence agence) {
		super(id, nom, prenom);
		this.agence = agence;
	}

	/**
	 * getter
	 * @return the agence
	 */
	public Agence getAgence() {
		return agence;
	}

	/**
	 * setter
	 * @param agence the agence to set
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	
	

}
