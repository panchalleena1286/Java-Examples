class Student {
    private String name;
    private int age;
    private int marks[] = new int[3];

    Student(String Name, int Age, int Marks[]){
        name = Name;
        age = Age;
        marks[0] = Marks[0];
        marks[1] = Marks[1];
        marks[2] = Marks[2];
    }

    public String get_name()
    {
        return name;
    }

    public int get_age()
    {
        return age;
    }

    
}
public class ExampleOnOOPsConcepts {
    
}
