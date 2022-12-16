package Classes;

public class Animateur {
private int id_Animateur;
private String nomAnimateur;
private String prenomAnimateur;

  public Animateur(int unid_Animateur,String unnomAnimateur,String unprenomAnimateur) {
	this.id_Animateur=unid_Animateur;
    this.nomAnimateur=unnomAnimateur;
    this.prenomAnimateur=unprenomAnimateur;
  }
  public String getnomAnimateur() {
	  return this.nomAnimateur;
  }
  public String getprenomAnimateur() {
	  return this.prenomAnimateur;
  }
 
}
