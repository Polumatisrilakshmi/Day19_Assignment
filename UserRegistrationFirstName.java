package COM.BRIDGELABZ;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationFirstName {
    static Scanner sri = new Scanner(System.in);
    public void firstName() {
            System.out.println("Enter the first name: ");
            String name = sri.next();
            Pattern pattern = Pattern.compile("^[A-Z]{3}[a-z]{2,7}$");
            Matcher match = pattern.matcher(name);

            if (match.matches()) {
                System.out.println("Name is valid");
            } else {
                System.out.println("Name is invalid, Try with another name.");
            }
        }

        public static void main(String[] args) {

            UserRegistrationFirstName check = new UserRegistrationFirstName();
            check.firstName();
        }
    }



