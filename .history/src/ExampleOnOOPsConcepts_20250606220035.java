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

    public int get_Maximum_Marks()
    {
        int maximum = marks[0];

        if(marks[1] >= marks[0] && marks[1] >= marks[2]){
            maximum = marks[1];
        }
        else if (marks[2] >= marks[0] && marks[2] >= marks[1]) {
            maximum = marks[2];
        }

        return maximum;
    }
}
public class ExampleOnOOPsConcepts {
    public static void main(String[] args) {

        int marks[] = new int[3]; 
        marks[0] = 50;
        marks[1] = 70;
        marks[2] = 30;

        Student s = new Student("Leena", 25, marks);

        System.out.println(s.get_name());
        System.out.println(s.get_age());
        System.out.println(s.get_Maximum_Marks());
    }
}
