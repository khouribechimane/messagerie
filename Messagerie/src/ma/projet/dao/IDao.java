
package ma.projet.dao;
import java.util.List;
public interface IDao <T> {
    
    public abstract
    boolean create (T o);
    boolean update (T o);
    boolean delete (T o);
    T getdById (int id);
    List<T> getAll ();
    
}