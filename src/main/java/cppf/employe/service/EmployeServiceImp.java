package cppf.employe.service;

import java.util.List;

import cppf.employe.entity.Employe;
import cppf.employe.entity.Service;
import cppf.employe.repository.ServiceRepository;
import cppf.employe.repository.impl.EmployeListeRepository;


public class EmployeServiceImp {
    private EmployeListeRepository employeRepository=new EmployeListeRepository();
    private ServiceRepository serviceRepository;
   
    public EmployeServiceImp(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
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
   public Service  rechercherParId(int id){
        return serviceRepository.selectById(id);
}


}
