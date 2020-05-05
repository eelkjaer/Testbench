public class Main {
    public static void main(String[] args){
        MainController ctrl = new AdminController();
        ctrl.showMenu();
        ctrl = new UserController();
        ctrl.showMenu();
    }
}
