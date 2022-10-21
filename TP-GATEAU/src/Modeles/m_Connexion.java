package Modeles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class m_Connexion {

	private static Connection nom_connexion;
	private static PreparedStatement pst;
	private static Statement st;
	private static ResultSet rs;
	
	
	public m_Connexion() {
		
	}
	
	
	public static Connection connexion(String uneIp, String uneDb , String unLogin , String unMdp )
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			nom_connexion = DriverManager.getConnection("jdbc:mysql://" + uneIp + "/" + uneDb + "?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","" + unLogin +"","" + unMdp);
			st = nom_connexion.createStatement();
		}
		catch(ClassNotFoundException e1)
		{
			System.out.println("Erreur : " + e1 + " 1 ");
			
		}
		catch(Exception e2)
		{
			System.out.println("Erreur : " + e2 + " 2 ");
		}
		return nom_connexion;
	}
	
	public static void deconnexion()
	{
		try
		{
			nom_connexion.close();
		}
		catch(Exception e4)
		{
			System.out.println("Erreur : " + e4 + " 3 ");
		}
		
	}
	
	public static boolean utilisateurExiste(String unId, String unMdp) {
		connexion("172.16.203.208","Recette","sio","slam");
		boolean res = false;
		int num = 0;
		try {
			pst = nom_connexion.prepareStatement("SELECT COUNT(*) AS nb FROM User WHERE login=? AND mdp=? ");
			pst.setString(1, unId);
			pst.setString(2, unMdp);
			rs = pst.executeQuery();
			rs.next();
			num = rs.getInt("nb");
			
			
			if(num>0)
			{
				res = true;
			}
			rs.close();
		//	String req = "SELECT COUNT(*) FROM utilisateur WHERE loginU="+unId+" AND mdpU="+unMdp;
		
		}
		catch(Exception e3)
		{
			System.out.println("Erreur : " + e3 + " 4 ");
		}
		deconnexion();
		return res;
	}
	
	public static void insertInto(String unLogin,String unMdp) {
		connexion("172.16.203.208","Recette","sio","slam");
		try
		{
			pst = nom_connexion.prepareStatement("INSERT INTO utilisateur(login,mdp) VALUES ( ? , ? )");
			pst.setString(1, unLogin);
			pst.setString(2, unMdp);
			int count = pst.executeUpdate();
		}
		catch(Exception e2)
		{
			System.out.println("Erreur : " + e2);
		}
		deconnexion();

	}
}
