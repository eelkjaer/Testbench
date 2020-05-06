import Controller.*;
import Data.UserHandler;

public class Main {
    public static void main(String[] args){
        UserHandler userOne = new UserHandler("admin","admin");
        MainController ctrl = userOne.createController();
        ctrl.showMenu();

        UserHandler userTwo = new UserHandler("thor","password");
        ctrl = userOne.createController();
        ctrl.showMenu();
    }
}
