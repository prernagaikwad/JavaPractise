import java.io.File;
import java.io.IOException;

public class Filecreate
{
    public static void main(String[] args)
    {
        File myfile = new File("FileDemo.txt");
        try
        {
            myfile.createNewFile();
        } catch (IOException e)
        {
            System.out.println("Unable to create this file");
            e.printStackTrace();

        }

    }
}
