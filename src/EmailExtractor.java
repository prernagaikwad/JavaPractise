
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {

    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string containing email addresses");
        String input = sc.nextLine();

        Matcher matcher = pattern.matcher(input);

        boolean found = false ;
        while (matcher.find())
        {
            System.out.println("Found email:"+ matcher.group());
            found = true;
        }

        if(!found)
        {
            System.out.println("No email addresses found.");
        }
        sc.close();;

    }

}
