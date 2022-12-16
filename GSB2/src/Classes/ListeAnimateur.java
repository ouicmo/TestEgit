package Classes;

import java.util.ArrayList;

public class ListeAnimateur {
private ArrayList<Animateur>mesAnimateur;

 public ListeAnimateur() {
	//mesVisiteur = new ArrayList<Visiteur>();
	 mesAnimateur = new ArrayList<Animateur>();
 }
 public int getNbAnimateur() {
	 return mesAnimateur.size();
 }
 public ArrayList<Animateur>getLesAnimateur(){
	 return this.mesAnimateur;
 }
 public void ajoutAnimateur(Animateur unAnimateur) {
	 this.mesAnimateur.add(unAnimateur);
	 System.out.println("votre animateur a bien etait ajouter");
	 
 }
}
