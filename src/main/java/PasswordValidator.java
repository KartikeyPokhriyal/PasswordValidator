import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public boolean isValid(String password) {
        if((password.length() == 0)) {
            return false;
        }
        else {
            String regular_expression = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,15}$";
            Pattern pattern = Pattern.compile(regular_expression);
            Matcher m = pattern.matcher(password);
            return m.find();
             }
        }
}
