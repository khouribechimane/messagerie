
package ma.projet.service;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.beans.Message;
import ma.projet.connexion.Connexion;
import ma.projet.dao.IDao;
public class MessageService implements IDao<Message> { 
private EmployerService es;
public MessageService() {
es= new EmployerService();
}
@Override
public boolean create(Message o) { try {
String req = "insert into message (objet, sujet, date, idE, idR) values(?,?,?,?,?)";
PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
ps.setString(1, o.getObject()); ps.setString(2, o.getSujet());
ps.setDate(3,  new Date(o.getDate().getTime())); 
ps.setInt(4, o.getEmpEmetteur().getid()); 
ps.setInt(5, o.getEmpRecepteur().getid());
if (ps.executeUpdate() == 1) { return true;
}
} catch (SQLException ex) {
Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE, null, ex);
}
return false;
}
@Override
public boolean update(Message o) { return false;
}
@Override
public boolean delete(Message o) { return false;
}
public Message getByid(int id) { Message employe = null;
try {
String req ="select* from message where id=?";
PreparedStatement ps =
Connexion.getConnection().prepareStatement(req); 
ps.setInt(1, id);
ResultSet rs = ps.executeQuery(); if (rs.next()) {
employe = new Message(rs.getInt("id"), 
        rs.getString("objet"), 
        rs.getString("sujet"), 
        rs.getDate("date"), 
        es.getByid(rs.getInt("idE")), 
        es.getByid(rs.getInt("idR")));
}
} catch (SQLException ex) { Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE,
null, ex);
}
return employe;
}

@Override
public List<Message> getAll() {
List<Message> employes = new ArrayList<>(); try {
String req ="select* from message"; PreparedStatement ps =
Connexion.getConnection().prepareStatement(req); ResultSet rs = ps.executeQuery();
while (rs.next()) {
employes.add(new Message(rs.getInt("id"), rs.getString("objet"), rs.getString("sujet"), rs.getDate("date"), es.getByid(rs.getInt("idE")),
 

es.getByid(rs.getInt("idR"))));
}
} catch (SQLException ex) { Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE,
null, ex);
}
return employes;
}

    @Override
    public Message getdById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
