package Vues;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlleurs.Main;
import Controlleurs.c_Controlleur;
import Modeles.m_Connexion;


public class v_Connexion extends JFrame implements ActionListener{
	
		private JPanel monPanel;
		private JLabel demandeIdentifiant;
		private JTextField identifiant;
		private JLabel demandeMdp;
		private JTextField mdp;
		private JButton btnValider;
		private JOptionPane jop2;
		private boolean unResultat;
		private c_Controlleur controlleur;
		
		
		
		public v_Connexion(c_Controlleur unControlleur) {
			
			this.setSize(700,500);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			
			this.monPanel = new JPanel();
			this.monPanel.setLayout(new GridLayout(3,2));
			this.demandeIdentifiant = new JLabel("Veuillez saisir votre identifiant :");
			this.identifiant = new JTextField();
			this.demandeMdp = new JLabel("Veuillez saisir votre mot de passe :");
			this.mdp = new JTextField();
			this.btnValider = new JButton("Valider");
			this.controlleur = new c_Controlleur();
			
			this.jop2 = new JOptionPane();
			
			this.monPanel.add(this.demandeIdentifiant);
			this.monPanel.add(this.identifiant);
			
			this.monPanel.add(this.demandeMdp);
			this.monPanel.add(this.mdp);
			
			this.monPanel.add(btnValider);
			this.btnValider.addActionListener(this);
			
			this.getContentPane().add(this.monPanel);
			this.setVisible(true);
			
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(identifiant.getText()+ mdp.getText());
		//	e.getActionCommand();
			
			if ( m_Connexion.utilisateurExiste(identifiant.getText(), mdp.getText()) == true){
				System.out.println("c'est bon");
				this.dispose();
				
				
				
				
			}
			else
			{
				JOptionPane jop2 = new JOptionPane();
				jop2.showMessageDialog(null,"Erreur dans l'indentifiant ou mdp ...","Attention",JOptionPane.WARNING_MESSAGE);
			}
		}
}


