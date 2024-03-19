package cppf.employe.repository;

import java.util.ArrayList;
import java.util.List;

import cppf.employe.entity.Service;
public class ServiceRepository {
     private List<Service> tableServices=new ArrayList<>();
        public void insert(Service emp) {
            tableServices.add(emp);

        } 
        public  List<Service>  selectAll(){
                return tableServices;
        } 
}
