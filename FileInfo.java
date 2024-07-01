import java.io.File;

public class FileInfo
{
    public static void main(String[] args)
    {
        File file = new File("FileDemo.txt");

        if(file.exists())
        {
         //Getting file name

            System.out.println("The name of the file is :"+file.getName());

            // Getting path of the file
            System.out.println("The absolute pathe of the file is "+file.getAbsolutePath());

            //Checking whether the file is writable or not
            System.out.println("IS file writeable?: " + file.canWrite());

            //Checking whether the file is read
            System.out.println("Is file readable " + file.canRead());

            //Getting the length of the file in bytes

            System.out.println("The size of the file in bytes is " + file.length());
        }
        else
        {
            System.out.println("The file does not exists");
        }

    }
}
