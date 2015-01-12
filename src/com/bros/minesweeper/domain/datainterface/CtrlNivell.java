package com.bros.minesweeper.domain.datainterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bros.minesweeper.domain.model.Nivell;

public class CtrlNivell {
	
    private static String dbURL = "jdbc:derby://localhost:1527/HibernateDB;create=true";
    private static String tableName = "Nivell";
    // jdbc Connection
    private static Connection conn = null;
    private static Statement stmt = null;

    private static void createConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL); 
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
	public ArrayList<Nivell> getAll() throws SQLException {
		// TODO Auto-generated method stub
		try {
			createConnection();
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM " + tableName);
            ArrayList<Nivell> nivells = new ArrayList<Nivell>();
            while(results.next()){
            	Nivell n = new Nivell();
            	n.setNom(results.getString("nom"));
            	n.setNombreCasellesxFila(results.getInt("nombreCasellesxFila"));
            	n.setNombreCasellesxColumna(results.getInt("nombreCasellesxColumna"));
            	n.setNombreMines(results.getInt("nombreMines"));
            	nivells.add(n);
            }
            results.close();
            stmt.close();
            conn.close();
    		return nivells;
		}
        catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}

	public static Nivell get(String nomNivell) {
		// TODO Auto-generated method stub
		try {
			createConnection();
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM " + tableName +" WHERE nom =" + nomNivell);

            Nivell n = new Nivell();
        	n.setNom(result.getString("nom"));
        	n.setNombreCasellesxFila(result.getInt("nombreCasellesxFila"));
        	n.setNombreCasellesxColumna(result.getInt("nombreCasellesxColumna"));
        	n.setNombreMines(result.getInt("nombreMines"));

            result.close();
            stmt.close();
            conn.close();
    		return n;
		}
        catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	} 
    
}
