package Controlleurs;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import Modeles.m_Connexion;
import Vues.v_Connexion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c_Controlleur controlleur = new c_Controlleur();
		v_Connexion vueConnexion = new v_Connexion(controlleur);

	}
	

}

