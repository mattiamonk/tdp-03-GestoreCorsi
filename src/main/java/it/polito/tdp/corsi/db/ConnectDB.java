package it.polito.tdp.corsi.db;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDB {
 
	//CREO PER CONNETTERE DB
	public static Connection getConnection() {
		//
		String url = "jdbc:mariadb://localhost/iscritticorsi?user=root&password=PinkFloyd2001!";
		
		//Raccogliamo eccezione nel caso in cui la connessione fallisca
		try {
			return DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Errore in connessione.");
			e.printStackTrace();
			return null;
		}
		
	}
	
}
