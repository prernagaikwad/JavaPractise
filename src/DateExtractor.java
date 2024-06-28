
import java.util.regex.*;
import java.util.Scanner;

public class DateExtractor
{

    public static void main(String[] args)
    {
        String regex ="\\b(\\d{4}-\\d{2}|\\d{2}/\\d{2}/\\d{4}|\\d{2}-\\d{2}-\\d{4}|\\d{2}\\.\\d{2}\\.\\d{4}|"
                     +"\\d{1,2}\\s+(?:January|February|March|April|May|June|July|August|September|October|November|December)\\s+\\d{4})\\b";


        Pattern pattern = Pattern.compile(regex);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string containing dates:");
        String input= sc.nextLine();

        Matcher matcher = pattern.matcher(input);

        boolean found = false;
        System.out.println("Extracted dates:");
        while (matcher.find())
        {
            System.out.println(matcher.group());
            found = true;
        }

        if(!found)
        {
            System.out.println("No dates found");
        }
        sc.close();

    }



}
