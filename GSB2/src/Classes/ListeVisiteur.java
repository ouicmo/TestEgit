package Classes;

import java.util.ArrayList;

public class ListeVisiteur {
private ArrayList<Visiteur>mesVisiteur;

  public ListeVisiteur() {
	 mesVisiteur = new ArrayList<Visiteur>();
 }
  public int getNbVisiteur() {
	  return mesVisiteur.size();
  }
  public ArrayList<Visiteur>getLesVIsiteur(){
	  return this.mesVisiteur;
  }
  public void ajoutVisiteur(Visiteur unVisiteur) {
	  mesVisiteur.add(unVisiteur);
	  System.out.println("votre visiteur a bien été ajouté");
  }
}
