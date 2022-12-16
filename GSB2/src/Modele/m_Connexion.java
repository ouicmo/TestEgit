package Modele;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class m_Connexion {

	private static Connection connexion;
	private static Statement st;
	private static ResultSet rs;
    private static PreparedStatement st1;
  public m_Connexion() {
		
	}
	public static void connexionBDD() {            // création d'une procédure qui permet la connection à la base de donnée 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connexion = DriverManager.getConnection("jdbc:mysql://172.16.203.212/gsb2?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "sio", "slam");
			st = connexion.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("erreur de connexion a la bdd" +e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Erreur chargement du pilote jdbc" + e);
		}
	}
	public static void deconnexion()
	{
		try
		{
			connexion.close();
		}
		catch(Exception e4)
		{
			System.out.println("Erreur : " + e4 + " 3 ");
		}
		
	}
}
