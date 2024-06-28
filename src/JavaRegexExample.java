import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexExample
{
    public static void main(String[] args)
    {

        String regex = "\\d+";
        String input = "The price is 100 dollars";
        String replacement = "xxx";

        Pattern pattern =Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        String result = matcher.replaceAll(replacement);
        System.out.println(result);


    }

}
