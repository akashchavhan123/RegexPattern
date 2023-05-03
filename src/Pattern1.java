
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        Pattern p = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        String s = sc.next();
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        if(b){
            System.out.println("Valid");
        }
        else {
            throw new RuntimeException("Email Id Wrong");
        }

    }
}