import java.util.*;

public class NameProcessing
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("John","Alice","Bob","Clara","Dave","Eve","Frank","George","Hannah","IVY");

        //1. Sort names alphabetically

        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames);
        System.out.println("Sorted Names :" + sortedNames);

        //2. Find names of a specific
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of names to find");
        int length = sc.nextInt();

        List<String> namesOfLength = new ArrayList<>();
        for(String name : names)
        {
            if(name.length()== length)
            {
                namesOfLength.add(name);
            }
        }

        System.out.println("Names of length " + length + ":"+namesOfLength);

    }


}
