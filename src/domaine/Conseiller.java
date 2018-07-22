package domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Conseiller extends Personne {
	/**
	 * Liste des clients gérés par un conseiller
	 */
	private Collection<Client> ListClient = new ArrayList();

	/**
	 * Constructeur avec paramètres
	 * 
	 * @param id Identifiant du conseiller
	 * @param nom Nom du conseiller
	 * @param prenom Prénom du conseiller
	 * @param listClient liste des clients gérés par le conseiller
	 */
	public Conseiller(int id, String nom, String prenom, Collection<Client> listClient) {
		super(id, nom, prenom);
		ListClient = listClient;
	}

	/**
	 * getter
	 * 
	 * @return the listClient
	 */
	public Collection<Client> getListClient() {
		return ListClient;
	}

	/**
	 * setter
	 * 
	 * @param listClient
	 *            the listClient to set
	 */
	public void setListClient(Collection<Client> listClient) {
		ListClient = listClient;
	}

	/**
	 * Méthode to string
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Conseiller [nom=" + super.getNom() + ", prenom=" + super.getPrenom() + "]";
	}

}
