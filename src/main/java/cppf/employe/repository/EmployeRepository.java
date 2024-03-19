package cppf.employe.repository;

import java.util.ArrayList;
import java.util.List;

import cppf.employe.entity.Employe;

public class EmployeRepository {
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
