import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String File_name = "students.txt";

    public void saveStudents(List<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(File_name))) {
            for (Student student : students) {
                writer.write(students.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(File_name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                students.add(Student.fromString(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("No student data found . Starting fresh");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

}
