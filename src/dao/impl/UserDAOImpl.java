package dao.impl;  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.Configuration;  
import dao.UserDAO;  
import dto.UserDto;  
public class UserDAOImpl implements UserDAO {  
    @Override  
    public void save(UserDto u) {  
        Configuration cfg = new Configuration();  
        SessionFactory sf = cfg.configure().buildSessionFactory();  
        Session session = sf.openSession();  
        session.beginTransaction();  
        session.save(u);  
        session.getTransaction().commit();  
        session.close();  
        sf.close();  
    }  
}  