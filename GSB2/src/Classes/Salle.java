package Classes;

public class Salle {
private int numero;
private String nom;
private int capacit�max;
 public Salle(int unnumero,String unnom,int unecapacit�max) {
	this.numero=unnumero;
	this.nom=unnom;
	this.capacit�max=unecapacit�max;
 }
 public int getnumeroSalle () {
	 return this.numero;
 }
 public String getnomSalle () {
	 return this.nom;
 }
 public int getcapacit�max() {
	 return this.capacit�max;
 }
}
