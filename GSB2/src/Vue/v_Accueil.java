package Vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Controlleur.c_Controlleur;

public class v_Accueil extends JMenuBar implements ActionListener{
    private JMenuBar Menu;
	private JMenu ajouter;
	private JMenu selectionner;
	private JMenu suprimer;
	
	
	public v_Accueil() {
		c_Controlleur controlleur = new c_Controlleur(); 
		JMenuBar Menu = new JMenuBar();
		ajouter = new JMenu("ajouter"); 
		JMenuItem rechercher1 = new JMenuItem("Rechercher une origine");
		
		ajouter.add(rechercher1);
		
		this.add(ajouter);
		
		
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
