
package domaine;

import java.util.ArrayList;
import java.util.Collection;

/**
 * cette classe corresspond a l'objet Agence
 * @author badr
 * @version 1.0 ArnaudV et BadrA
 *
 */
public class Agence {
	
	/**
	 * identifiant de l'agence
	 */
	private int id;
	/**
	 * nom de l'agence
	 */
	private String nom;
	/**
	 * date de création de l'agence
	 */
	private String dateCreation;
	/**
	 * LE gerant unique de l'agence
	 */
	private Gerant gerant;
	/**
	 * Les conseillers travaillant dans l'agence
	 */
	private Collection<Conseiller> ListConseiller= new ArrayList();
	
	
	/**
	 * constructeur avec paramètre
	 * @param id
	 * @param nom
	 * @param dateCreation
	 */
	public Agence(int id, String nom, String dateCreation) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateCreation = dateCreation;
	}

	/**
	 * constructeur par défaut
	 */
	public Agence() {
		super();
	}

	/**
	 * getters et setters
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
	 * @return the dateCreation 
	 */
	public String getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set 
	 */
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the gerant 
	 */
	public Gerant getGerant() {
		return gerant;
	}

	/**
	 * @param gerant the gerant to set 
	 */
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	/**
	 * @return the listConseiller 
	 */
	public Collection<Conseiller> getListConseiller() {
		return ListConseiller;
	}

	/**
	 * @param listConseiller the listConseiller to set 
	 */
	public void setListConseiller(Collection<Conseiller> listConseiller) {
		ListConseiller = listConseiller;
	}

	/**
	 * Méthode to String
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agence [id=" + id + ", dateCreation=" + dateCreation + "]";
	}
	
}
