package cppf.employe.repository.impl;

import java.util.ArrayList;
import java.util.List;

import cppf.employe.entity.Service;
import cppf.employe.repository.ServiceRepository;
public class ServiceListeRepository implements ServiceRepository{
     private List<Service> tableServices=new ArrayList<>();
        public void insert(Service emp) {
            tableServices.add(emp);

        } 
        public  List<Service>  selectAll(){
                return tableServices;
        } 

        public  Service  selectById(int id){
            for (Service serv : tableServices) {
                  if (serv.getId()==id) {
                    return serv;
                  }
            }
            return null;
    } 
}
