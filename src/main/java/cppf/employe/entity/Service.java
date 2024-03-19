package cppf.employe.entity;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private static int nbreService;
    public static int getNbreService() {
        return nbreService;
    }
    public static void setNbreService(int nbreService) {
        Service.nbreService = nbreService;
    }
    private int id;
    private String nomService;
    private List<Employe> employes=new ArrayList<>();

    public Service() {
        id=++nbreService;
    }
    public List<Employe> getEmployes() {
        return employes;
    }
    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomService() {
        return nomService;
    }
    public void setNomService(String nomService) {
        this.nomService = nomService;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nomService == null) ? 0 : nomService.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Service other = (Service) obj;
        if (id != other.id)
            return false;
        if (nomService == null) {
            if (other.nomService != null)
                return false;
        } else if (!nomService.equals(other.nomService))
            return false;
        return true;
    }


}
