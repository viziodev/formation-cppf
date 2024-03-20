package cppf.employe.repository.impl;

import java.util.ArrayList;
import java.util.List;

import cppf.employe.entity.Employe;
import cppf.employe.repository.EmployeRepository;

public class EmployeListeRepository implements EmployeRepository {
        private List<Employe> tableEmployes=new ArrayList<>();
        public void insert(Employe emp) {
                tableEmployes.add(emp);
        } 
        public  List<Employe>  selectAll(){
                return tableEmployes;
        }
        public  Employe  selectByMatricule(String matricule){
            for (Employe emp : tableEmployes) {
                  if (emp.getMatricule().equals(matricule)) {
                        return emp;
                  }
            }
            return null;
           
    }
    

    
}
