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
            	n.setNom(results.getString(1));
            	n.setNombreCasellesxFila(results.getInt(2));
            	n.setNombreCasellesxColumna(results.getInt(3));
            	n.setNombreMines(results.getInt(4));
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
            n.setNom(result.getString(1));
            n.setNombreCasellesxFila(result.getInt(2));
            n.setNombreCasellesxColumna(result.getInt(3));
            n.setNombreMines(result.getInt(4));

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
