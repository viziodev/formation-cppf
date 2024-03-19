package cppf.employe.service;

import java.util.List;

import cppf.employe.entity.Employe;
import cppf.employe.entity.Service;
import cppf.employe.repository.EmployeRepository;
import cppf.employe.repository.ServiceRepository;

public class EmployeServiceImp {
    private EmployeRepository employeRepository=new EmployeRepository();
    private ServiceRepository serviceRepository=new ServiceRepository();
   
    public void creerEmploye(Employe emp){
        //emp.getService().getEmployes().add(emp);
        employeRepository.insert(emp);
    }
   public  List<Employe>  listeEmploye(){
           return null;
   }
   public  Employe  rechercherEmployeParMatricule(String matricule){
    return null;
}

   public void creerService(Service service){
       serviceRepository.insert(service);
   }
   public List<Service>  listeService(){
         return serviceRepository.selectAll();
   }


}
