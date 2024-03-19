package cppf.employe.entity;

public class Employe {
    private int id;
    private String nomComplet;
    public String getNomComplet() {
        return nomComplet;
    }
    private String matricule;
    public String getMatricule() {
        return matricule;
    }
    //ManyToOne
    private Service service;
    
    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }
    //Classe PascalCase
    //Attribut et Methode    camelCase
    public int getId(){
       return id;  
    }
    public void setId(int id){
            this.id=id;  
        
     }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((matricule == null) ? 0 : matricule.hashCode());
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
        Employe other = (Employe) obj;
        if (id != other.id)
            return false;
        if (matricule == null) {
            if (other.matricule != null)
                return false;
        } else if (!matricule.equals(other.matricule))
            return false;
        return true;
    }
}
