package Classes;

public class Visiteur {
private int id;
private String nom;
private String prenom;


 public Visiteur(int unid,String unnom,String unprenom) {
	this.id=unid;
	this.nom=unnom;
	this.prenom=unprenom;
 }
 public int getidVisiteur() {
	 return this.id;
 }
 public String getnomVisiteur() {
	 return this.nom;
 }
 public String getprenomVisiteur() {
	 return this.prenom;
 }
}
