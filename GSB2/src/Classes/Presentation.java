package Classes;

import java.sql.Date;
import java.sql.Time;

public class Presentation {
private int idPresentation;
private Date unedate;
private Time horaire;
private Time dur�e_pr�vue;

public Presentation(int unidPresentation,Date unedate1,Time unhoraire,Time unedur�epr�vue) {
	this.idPresentation=unidPresentation;	
	this.unedate=unedate1;
	this.horaire=unhoraire;
	this.dur�e_pr�vue=unedur�epr�vue;
}
public Date getPresentation() {
	return unedate;
}
public Time gethorairePresentation() {
	return horaire;
}
public Time getdur�e_pr�vuePresentation() {
	return dur�e_pr�vue;
}
}
