package cppf.employe.repository.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
   private String BDD = "cppf_employe";
   private String url = "jdbc:mysql://localhost:3306/" + BDD;
   private String user = "root";
   private  String passwd = "root";
   protected Connection conn;
   public void ouvrirConnexion(){
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(url, user, passwd);
      System.out.println("Connecter");
   } catch (Exception e){
       System.out.println(e.getMessage());
       System.exit(0);
   }
   }

   public void fermerConnexion(){
    try {
      if (!conn.isClosed()) {
           conn.close();
       }
   } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
   }
   }
}
