public class UserController extends MainController{

    @Override
    public void showMenu() {
        System.out.println("User menu");
        super.logout();
    }
}
