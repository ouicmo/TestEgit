package Classes;

import javax.xml.crypto.Data;

import java.sql.Date;
import java.sql.Time;
import java.time.*;

public class Inscription {
private int idVisiteur;
private String idPresentation;
private Date unedate;
private Time horaire;

public Inscription(int unidVisiteur,String unidPresentation,Date unedate1,Time unhoraire) {
	this.idVisiteur=unidVisiteur;
	this.idPresentation=unidPresentation;
	this.unedate=unedate1;
	this.horaire=unhoraire;
}
}
