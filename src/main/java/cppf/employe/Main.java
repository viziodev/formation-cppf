package cppf.employe;

import java.util.List;
import java.util.Scanner;

import cppf.employe.entity.Employe;
import cppf.employe.entity.Service;
import cppf.employe.repository.impl.ServiceBDRepository;
import cppf.employe.service.EmployeServiceImp;

public class Main {
   

    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       ServiceBDRepository serviceBDRepository = new ServiceBDRepository();
       EmployeServiceImp employeServiceImp=new EmployeServiceImp(serviceBDRepository);
       List<Service> listeService ;
       int choix;
       do {
        System.out.println("1-Creer Service");
        System.out.println("2-Lister Service");
        System.out.println("3-Creer  Employe");
        System.out.println("4-Lister Employe");
        System.out.println("5-Lister  Employe par Matricule");
        System.out.println("6-Lister  Les Employe d un Service");
        System.out.println("7-Sortir");
        choix=scanner.nextInt();
         scanner.nextLine();
         EmployeServiceImp employeServiceImp2 = employeServiceImp;
        switch (choix) {
            case 1:
                  System.out.println("Entrer le nom du service");
                  String nom=scanner.nextLine();
                  Service service=new Service();
                  service.setNomService(nom);
                  employeServiceImp2.creerService(service);
                
                break;
            case 2:
                 System.out.println("Entrer le nom");
                 String nomEmp=scanner.nextLine();
                 System.out.println("Entrer le  matricule");
                 String matr=scanner.nextLine();
                 listeService = employeServiceImp2.listeService();
               
                for (Service se : listeService) {
                    System.out.println("ID :"+se.getId());
                    System.out.println("Nom Service :"+se.getNomService());
                }
                  System.out.println("Entrer l'id du Service");
                  int idServ=scanner.nextInt();
                  Service service2=employeServiceImp.rechercherParId(idServ);
                  if (service2==null) {
                       System.out.println("Erreur");
                  } else {
                        Employe employe=Employe
                        .builder()
                        .nomComplet(nomEmp)
                        .matricule(matr)
                        .service(service2)
                        .build();
                        employe.setService(service2);
                        service2.getEmployes().add(employe);
                  }
                
                break;
                case 3:

                 listeService = employeServiceImp2.listeService();
                 System.out.println("Nombre Service :"+Service.getNbreService());
                for (Service se : listeService) {
                    System.out.println(se.getId()+"- "+se.getNomService());
                }
                break;

                case 6:
                listeService = employeServiceImp2.listeService();
               
                    for (Service se : listeService) {
                        System.out.println("ID :"+se.getId());
                        System.out.println("Nom Service :"+se.getNomService());
                    }
                    System.out.println("Entrer l'id du Service");
                   idServ=scanner.nextInt();
                   Service service1=employeServiceImp.rechercherParId(idServ);
                   if (service1==null) {
                    System.out.println("Erreur");
               } else {
                List<Employe> employes = service1.getEmployes(); 
                System.out.println("Service "+service1.getNomService());
                  employes.stream().forEach(emp->{
                       System.out.println("Nom "+emp.getNomComplet());
                  });
                  
               }
             
            default:
                break;
        }
       } while (choix!=7);
}
}