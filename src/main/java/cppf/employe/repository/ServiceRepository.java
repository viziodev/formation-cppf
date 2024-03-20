package cppf.employe.repository;


import cppf.employe.entity.Service;

public interface ServiceRepository extends Repository<Service> {
       Service  selectById(int id);
}
