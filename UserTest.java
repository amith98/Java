abstract class User {
    abstract void showMessage();
    public void displayUserType() {
        System.out.println("User type selected");
    }
}
class AdminUser extends User {
    public void showMessage() {
        System.out.println("Welcome, Admin");
    }
}
class GuestUser extends User {
    public void showMessage() {
        System.out.println("Welcome, Guest");
    }
}
public class UserTest {
    public static void main(String[] args) {
        AdminUser objAdminUser = new AdminUser();
        GuestUser objGuestUser = new GuestUser();
        objAdminUser.displayUserType();
        objAdminUser.showMessage();
        objGuestUser.displayUserType();
        objGuestUser.showMessage();
        
    }
    
}
