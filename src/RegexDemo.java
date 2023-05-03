import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.next();
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        System.out.println(Pattern.matches(regex,s));

    }
}