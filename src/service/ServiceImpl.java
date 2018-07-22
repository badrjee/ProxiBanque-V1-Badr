 package service;

import java.util.Hashtable;
import java.util.Map;

import domaine.Agence;
import domaine.CB;
import domaine.Client;
import domaine.Compte;
import domaine.Conseiller;
import domaine.Placement;
import domaine.Virement;

public class ServiceImpl implements Iservice {
	
	//DECLARATION ET INITIALISATION MAP POUR SIMULATION BDD
	private Map<Integer,Client> clients = new Hashtable<Integer,Client>();
    private Map<Integer,Compte> comptes = new Hashtable<Integer,Compte>();
	private Map<Integer,Agence> agences = new Hashtable<Integer,Agence>();
	private Map<Integer, CB> CBlist = new Hashtable<Integer,CB>();
	private Map<Integer, Virement> virements = new Hashtable<Integer, Virement>();
	private Map<Integer, Placement> placements = new Hashtable<Integer, Placement>();
	
	//-----------------------------AGENCES-----------------------------
	@Override
	public Map<Integer, Agence> ajouterAgence(Agence a) {
		agences.put(a.getId(), a);
		return agences;
	}
	
	@Override
	public void modifierAgence(Agence a) {
		//TODO A implémenter en V2
	}

	@Override
	public void supprimerAgence(Agence a) {
		//TODO A implémenter en V2		
	}

	@Override
	public void listeAgence(Map<Integer, Agence> agences) {
		for (Map.Entry<Integer, Agence> entry : agences.entrySet()) {
			 System.out.println(entry);
			 if(entry.getValue().getListConseiller()!=null)
			 {
				 for (Conseiller conseiller : entry.getValue().getListConseiller()) {
					System.out.println(conseiller);
				}
			 }
		 }
	}

	@Override
	public Map<Integer, Compte> afficherComptesDebiteurs(Agence a) {
		return null;
	}
	
	//-----------------------------CB-----------------------------
	@Override
	public Map<Integer, CB> ajouterCB(CB cb) {
		CBlist.put(cb.getId(), cb);
		return CBlist;
	}

	@Override
	public void modifierCB(CB cb) {
		// TODO en V2
		
	}
	
	@Override
	public void supprimerCB(CB cb) {
		// TODO en V2
		
	}

	@Override
	public void listeCB(Map<Integer, Map> CBlist) {
		// TODO en V2
		
	}
	
	//-----------------------------CLIENTS-----------------------------

	@Override
	public void afficherClient(Client c) {
		// TODO en V2
		
	}

	@Override
	public void attribuerCompte(Compte c, Client cl) {
		cl.getListCompte().add(c);
		//opération inverse pour être synchronysé car pas encore de bdd
		c.setProprietaire(cl);
	}

	@Override
	public void atttribuerCB(CB cb, Client c) {
		// TODO en V2
		
	}
	
	@Override
	public Map<Integer, Client> ajouterClient(Client cl) {
		clients.put(cl.getId(), cl);
		return clients;
	}

	@Override
	public void modifierClient(Client p) {
		// TODO A implémenter en V2
	}

	@Override
	public void supprimerClient(Client p) {
		// TODO A implémenter en V2
		
	}

	@Override
	public void listeClient(Map<Integer, Client> clients) {
		for (Map.Entry<Integer, Client> entry : clients.entrySet()) {
			 System.out.println(entry);
			 if(entry.getValue().getListCompte()!=null)
			 {
				 for (Compte compte : entry.getValue().getListCompte()) {
					System.out.println(compte);
				}
			 }
		 }
	}
	
	//-----------------------------COMPTES-----------------------------
	
	@Override
	public Map<Integer, Compte> ajouterCompte(Compte c) {
		comptes.put(c.getId(), c);
		return comptes;
	}

	@Override
	public void modifierCompte(Compte c) {
		// TODO to implement in V2
		
	}

	@Override
	public void supprimerCompte(Compte c) {
		// TODO A implémenter en V2
		
	}

	@Override
	public void listeCompte(Map<Integer, Compte> comptes) {
		for (Map.Entry<Integer, Compte> entry : comptes.entrySet()) {
			 System.out.println(entry);
			 if(entry.getValue().getProprietaire()!=null)
			 {
				 System.out.println("proriétaire="+entry.getValue().getProprietaire().getNom()+" "+entry.getValue().getProprietaire().getPrenom());
			 }
		 }
	}
	
	@Override
	public void crediterCompte(Compte c, double mt) {
		// TODO crediter gérer exceptions ou if
		c.setSolde(c.getSolde() + mt);
	}

	@Override
	public void debiterCompte(Compte c, double mt) {
		// TODO debiter gérer exceptions ou if
		c.setSolde(c.getSolde() - mt);
	}

	@Override
	public void executerVirement(Virement v, Compte cd, Compte cc) {
		
		//1. debiter le compte du montant saisi à la création du virement
		debiterCompte(cd, v.getMontant());
		
		//2. crediter ce même montant saisi à la création du virement
		crediterCompte(cc, v.getMontant());
		
		//3. Affiche un message 
		System.out.println("Un virement de "+v.getMontant()+"€ a été effectué du compte numéro " +cd.getId()+" au compte numéro "+cc.getId()+".");
		
	}
	public Map<Integer, Virement> creerVirement(Virement v) {
		virements.put(v.getId(), v);
		return virements;
		
	}

	@Override
	public Map<Integer, Placement> ajouterPlacement(Placement p) {
		placements.put(p.getId(), p);
		return placements;
	}

	@Override
	public void supprimerPlacement(Placement p) {
		// TODO A implémenter en V2
		
	}

	@Override
	public void executerPlacement(Compte c, Placement p) {
		//1.debite le compte du montant du placement à effectuer
		debiterCompte(c, p.getMontant());
		//affiche un message de confirmation
		System.out.println("Un placement à hauteur de " + p.getMontant() + " a été effectué sur la Bourse de " +p.getBourse()+" pour une durée minimale de "+p.getDuree()+" mois.");
	}
	
	
}
