package TestPackage;
import java.util.Date;
import ma.projet.beans.Message;
import ma.projet.service.EmployerService;
import ma.projet.service.MessageService;

public class TestMessage {

    public static void main(String[] args) {
        EmployerService es = new EmployerService();
        MessageService ms = new MessageService();
        ms.create(new Message("Réunion", "Réunion de fin d'année",  new Date(),es.getByid(1), es.getByid(2)));
       
      ms.create(new Message("Réunion", "Réunion de fin d'année",  new Date(), es.getByid(1), es.getByid(3)));
     
      ms.create(new Message("Stage", "Stage à Marrakech", new Date(),es.getByid(2), es.getByid(1)));
     ms.create(new Message("Stage", "Stage à Marrakech",  new Date(),es.getByid(2),es.getByid(3)));
    //Les message reçus par l'employé 3 
       for (Message m: ms.getAll()) {
     if(m.getEmpRecepteur().getid() == 3)
     System.out.println(""+m.getSujet());

}    
    }
}
             



   