package TestPackage;
import ma.projet.service.EmployerService;
import ma.projet.beans.Employe;

public class TestEmploye {
    public static void main(String[] args) {
         EmployerService es = new EmployerService();
    //creation d'un employee 
         es.create(new Employe( "LACHGAR", "Mohamed")); 
         es.create(new Employe("RAMI", "ALI")); 
         es.create(new Employe("SAFI", "Fatima"));
        
       //Modification d'un employe 
         Employe e = es.getByid(3); if (e != null) {
e.setNom("ALADUI");
e.setPrenom("Manale"); 
es.update(e);
}

         //supression d'une employee
         es.delete(es.getByid(4));
         
         //Liste des employes 
         for(Employe emp : es.getAll())
    System.out.println(""+emp.getNom());

         
    }}
  