

public class Student
{
    private String name;
    private int age ;
    private String id ;

    public Student(String name , int age , String id)
    {
        this.name = name ;
        this.age = age ;
        this.id = id ;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " ,"+ age + " ," + id;
    }

    public static Student fromString(String str)
    {
        String[] parts = str.split(",");
        if(parts.length == 3)
        {
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            String id = parts[2];
            return new Student(name ,age ,id);
        }
        else
        {
            throw new IllegalArgumentException("String does not represent a valid student. ");
        }


    }
}
