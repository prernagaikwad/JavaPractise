import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        FileHandler fileHandler = new FileHandler();
        List<Student> students = fileHandler.loadStudents();

        Scanner sc  = new Scanner(System.in);
        while (true)
        {
            System.out.println("1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Exit");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter student name :");
                    String name = sc.nextLine();
                    System.out.println("Enter student age:");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter student ID:");
                    String id = sc.nextLine();
                    students.add(new Student(name,age,id));
                    fileHandler.saveStudents(students);
                    break;


                case 2:
                    for(Student student:students)
                    {
                        System.out.println(student);
                    }
                    break;

                case 3:
                    sc.close();
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }
}
