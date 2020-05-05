public class AdminController extends MainController {
    @Override
    public void showMenu() {
        System.out.println("Administrator menu");
        super.logout();
    }
}
