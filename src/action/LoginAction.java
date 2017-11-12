package action;

import com.opensymphony.xwork2.ActionSupport;
import dto.UserDto;  
import service.UserService; 

public class LoginAction extends ActionSupport {  
    private static final long serialVersionUID = 1L;  
    private UserDto user;  
    @Override  
    public String execute() throws Exception {
    	UserService userService = new UserService();  
        userService.add(user);  
        return SUCCESS;  
    }  
    public UserDto getUser() {  
        return user;  
    }  
    public void setUser(UserDto user) {  
        this.user = user;  
    }  
}  