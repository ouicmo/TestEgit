package Classes;

public class Salle {
private int numero;
private String nom;
private int capacitémax;
 public Salle(int unnumero,String unnom,int unecapacitémax) {
	this.numero=unnumero;
	this.nom=unnom;
	this.capacitémax=unecapacitémax;
 }
 public int getnumeroSalle () {
	 return this.numero;
 }
 public String getnomSalle () {
	 return this.nom;
 }
 public int getcapacitémax() {
	 return this.capacitémax;
 }
}
