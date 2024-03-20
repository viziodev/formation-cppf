package cppf.employe.repository.impl;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import cppf.employe.entity.Service;
import cppf.employe.repository.ServiceRepository;
import cppf.employe.repository.core.DataBase;
public class ServiceBDRepository extends DataBase implements ServiceRepository {

  @Override
  public void insert(Service emp) {
   ouvrirConnexion();
   String sql="INSERT INTO `service` (`nom_service`) VALUES (?)";
   try {
    PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1, emp.getNomService());
        ps.executeUpdate();
        ps.close();
        fermerConnexion();
  } catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }

  }

  @Override
  public List<Service> selectAll() {
    List<Service> services=new ArrayList<>();
    ouvrirConnexion();
         String sql="SELECT * FROM `service`";
         try {
           PreparedStatement ps=conn.prepareStatement(sql);
           ResultSet rs=   ps.executeQuery();
           while (rs.next()) {
               Service service=new Service();
               service.setId((rs.getInt("id")));
               service.setNomService((rs.getString("nom_service")));
               services.add(service);
           }
          fermerConnexion();
        } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
   
        return services;
  }

  @Override
  public Service selectById(int id) {
    Service service=null;
    ouvrirConnexion();
    String sql="SELECT * FROM `service` where id=?";
    try {
      PreparedStatement ps=conn.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs=   ps.executeQuery();

      while (rs.next()) {
           service=new Service();
           service.setId((rs.getInt("id")));
           service.setNomService((rs.getString("nom_service")));
         
      }
     fermerConnexion();
   } catch (SQLException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
   }

   return service;
  }
     
}
