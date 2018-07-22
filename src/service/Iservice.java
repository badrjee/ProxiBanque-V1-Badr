package service;

import java.util.Map;

import domaine.Agence;
import domaine.CB;
import domaine.Client;
import domaine.Compte;
import domaine.Personne;
import domaine.Placement;
import domaine.Virement;

/**
 * Interface du package service, déclare l'ensemble des méthodes nécessaire aux classes
 * de la couche domaine.
 * @author Arnaud
 *
 */
public interface Iservice {
	
	//------------------------AGENCE------------------------
	/**
	 *  Permet d'afficher la liste de toutes les agences déjà enregistrée.
	 * @param Agence a de type agence
	 * @return Map<Integer, Agence> retourne une liste
	 */
	public Map<Integer, Agence> ajouterAgence(Agence a);
	
	/**
	 * Agence Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param  a de type agence
	 */
	public void modifierAgence(Agence a);
	
	/**
	 * Agence Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @param a de type agence
	 */
	public void supprimerAgence(Agence a);
	
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @param agences  de type agence
	 */
	public void listeAgence(Map<Integer, Agence> agences);
	/**
	 *Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @param c  de type Client
	 */
	public void afficherClient(Client c);
	
	
	//------------------------GERANT------------------------
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @param a de type agence
	 * @return retourn une liste
	 */
	public Map<Integer, Compte> afficherComptesDebiteurs(Agence a);
	
	
	//------------------------CB------------------------
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param cb de type CB 
	 */
	public Map<Integer, CB> ajouterCB(CB cb);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param cb de type CB
	 */
	public void modifierCB(CB cb);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @param cb de type CB
	 */
	public void supprimerCB(CB cb);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param CBlist de type Map
	 */
	public void listeCB(Map<Integer, Map> CBlist);
	
	//------------------------CONSEILLER------------------------
	

	
	//------------------------CLIENT------------------------
	/**
	 * Méthode qui ajoute un client dans une collection
	 * @param cl de type Client
	 * @return retoune une Map
	 */
	public Map<Integer, Client> ajouterClient(Client cl);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @param p de type Client
	 */
	public void modifierClient(Client p);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @param p de type client
	 */
	public void supprimerClient(Client p);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @param clients de type Collection de client
	 */
	public void listeClient(Map<Integer, Client> clients);
	/**
	 * attribuer un compte à un client
	 * @param c une méthode qui renvoi un Map
	 * @param cl de type client
	 */
	public void attribuerCompte(Compte c, Client cl);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @param cb de type CB
	 * @param c de type Client
	 */
	public void atttribuerCB(CB cb, Client c);
	
	//------------------------COMPTE------------------------
	/**
	 * ajouter un compte
	 * @param c de type compte
	 * @return retourne une MAP
	 */
	public Map<Integer, Compte> ajouterCompte(Compte c);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param c de type compte
	 */
	public void modifierCompte(Compte c);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @param c de type compte
	 */
	public void supprimerCompte(Compte c);
	/**
	 * Méthode qui permet d'afficher la liste des comptes
	 * @param comptes
	 */
	public void listeCompte(Map<Integer, Compte> comptes);
	/**
	 * permet de créditer un compte
	 * @param c  de type compte
	 * @param mt de type double
	 */
	public void crediterCompte(Compte c, double mt);
	/**
	 * permet de déditer un compte
	 * @param c de type Compte
	 * @param mt de type Double
	 */
	public void debiterCompte(Compte c, double mt);
	
	//------------------------PLACEMENT------------------------
	/**
	 * Stockage d'un placement dans une collection.
	 * @param p un placement à stocker
	 * @return Map
	 */
	public Map<Integer, Placement> ajouterPlacement(Placement p);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @param p de type placement
	 */
	public void supprimerPlacement(Placement p);
	/**
	 * Méthode permettant d'effectuer un placement à partir d'un compte.
	 * @param c de type Compte
	 * @param p de type Placement
	 */
	public void executerPlacement(Compte c, Placement p);
	
	
	//------------------------VIREMENT------------------------
	/**
	 * Stockage d'un virement dans une Collection.
	 * @param v de type virement
	 * @return Map
	 */
	public Map<Integer, Virement> creerVirement(Virement v);
	/**
	 * créditer un compte et débiter un autre comptre
	 * @param v de type virement
	 * @param c1 de type Compte
	 * @param c2 de type Compte
	 */
	public void executerVirement(Virement v, Compte c1, Compte c2);
	
}
