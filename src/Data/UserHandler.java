package Data;

import Controller.AdminController;
import Controller.MainController;
import Controller.UserController;

public class UserHandler {
    private String username, password;
    private int userPermissions;

    public UserHandler(String username, String password){
        this.username = username;
        this.password = password;
        userPermissions = checkUserPermissions(username);
    }

    private int checkUserPermissions(String username){
        switch (username){
            case "admin": return 1;
            case "mod": return 2;
            default: return 3;
        }
    }

    public MainController createController(){
        switch (this.userPermissions){
            case 1: return new AdminController();
            //case 2: return new ModController(); //Retunerer kasserer controller
            default: return new UserController();
        }
    }
}
