package Classes;

public class Intervenant {
private int id_Intervenant;
private String nomIntervenant;
private String prenomIntervenant;

 public Intervenant(int unid_Intervenant,String unnomIntervenant,String unprenomIntervenant) {
	this.id_Intervenant=unid_Intervenant;
	this.nomIntervenant=unnomIntervenant;
	this.prenomIntervenant=unprenomIntervenant;
 }
 public String getnomIntervenant() {
	return this.nomIntervenant;
 }
 public String getprenomIntervenant() {
	return this.prenomIntervenant;
 }
 public int getidIntervenant() {
	return this.id_Intervenant;
 }
 
}
