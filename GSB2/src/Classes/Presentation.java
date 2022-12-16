package Classes;

import java.sql.Date;
import java.sql.Time;

public class Presentation {
private int idPresentation;
private Date unedate;
private Time horaire;
private Time durée_prévue;

public Presentation(int unidPresentation,Date unedate1,Time unhoraire,Time uneduréeprévue) {
	this.idPresentation=unidPresentation;	
	this.unedate=unedate1;
	this.horaire=unhoraire;
	this.durée_prévue=uneduréeprévue;
}
public Date getPresentation() {
	return unedate;
}
public Time gethorairePresentation() {
	return horaire;
}
public Time getdurée_prévuePresentation() {
	return durée_prévue;
}
}
