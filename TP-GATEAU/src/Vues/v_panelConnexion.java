package Vues;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlleurs.c_Controlleur;

public class v_panelConnexion extends JPanel{
	
	private JLabel demIdentifiant;
	private JTextField identifiant;
	private JLabel demMdp;
	private JTextField mdp;
	private JButton btnValider;
	private JOptionPane jop2;
	private boolean unResultat;
	private c_Controlleur controlleur;
	
	
	public v_panelConnexion(c_Controlleur unControlleur)
	{
		this.controlleur = unControlleur;
		this.setLayout(new GridLayout(5,1));
		this.demIdentifiant = new JLabel("Veuillez saisir votre identifiant :");
		this.identifiant = new JTextField();
		this.demMdp = new JLabel("Veuillez saisir votre mot de passe :");
		this.mdp = new JTextField();
		this.btnValider = new JButton("Valider");
		
		this.jop2 = new JOptionPane();
		
		this.add(this.demIdentifiant);
		this.add(this.identifiant);
		
		this.add(this.demMdp);
		this.add(this.mdp);
		
		this.add(btnValider);
		/*this.btnValider.addActionListener(this);*/
	}
	
	

}
