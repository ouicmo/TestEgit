package Controlleur;

import Modele.m_Connexion;
import Vue.v_Accueil;
import Vue.v_JFrame;


public class Main {
	static v_Accueil monAccueil;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m_Connexion.connexionBDD();
		
		v_JFrame fenettre = new v_JFrame();
		monAccueil = new v_Accueil();
		fenettre.add(monAccueil);
		
	}

}
