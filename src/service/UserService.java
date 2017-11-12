package service;  
import dao.UserDAO;  
import dao.impl.UserDAOImpl;  
import dto.UserDto;  
public class UserService {  
    private UserDAO userDAO = new UserDAOImpl();  
    public UserDAO getUserDAO() {  
        return userDAO;  
    }  
    public void setUserDAO(UserDAO userDAO) {  
        this.userDAO = userDAO;  
    }  
    public void add(UserDto u) {  
        userDAO.save(u);  
    }  
}  