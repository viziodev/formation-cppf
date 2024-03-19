package cppf.employe;

import java.util.List;
import java.util.Scanner;

import cppf.employe.entity.Employe;
import cppf.employe.entity.Service;
import cppf.employe.service.EmployeServiceImp;

public class Main {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       EmployeServiceImp employeServiceImp=new EmployeServiceImp();
       int choix;
       do {
        System.out.println("1-Creer Service");
        System.out.println("2-Lister Service");
        System.out.println("1-Creer Service");
        System.out.println("1-Creer Service");
        System.out.println("-Creer Service");
        System.out.println("6-Sortir");
        choix=scanner.nextInt();
         scanner.nextLine();
         switch (choix) {
            case 1:
                  System.out.println("Entrer le nom du service");
                  String nom=scanner.nextLine();
                  Service service=new Service();
                  service.setNomService(nom);
                  employeServiceImp.creerService(service);
                
                break;
            case 2:
                List<Service> listeService = employeServiceImp.listeService();
                System.out.println("Nombre Service :"+Service.getNbreService());
                for (Service se : listeService) {
                    System.out.println("ID :"+se.getId());
                    System.out.println("Nom Service :"+se.getNomService());
                }
                break;
            default:
                break;
        }
       } while (choix!=6);
}
}