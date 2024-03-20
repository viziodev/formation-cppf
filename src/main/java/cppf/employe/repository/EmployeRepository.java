package cppf.employe.repository;


import cppf.employe.entity.Employe;

public interface EmployeRepository extends Repository<Employe> {
    Employe  selectByMatricule(String matricule);
}
