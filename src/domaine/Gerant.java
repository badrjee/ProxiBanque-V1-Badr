package domaine;

public class Gerant extends Personne {
	/**
	 * L'Agence est g�r� et auditer par le g�rant.
	 */
	private Agence agence;

	/**
	 * Constructeur avec param�tres
	 * @param id Identifiant du g�rant
	 * @param nom Nom gerant
	 * @param prenom Prenom du  g�rant
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
