package Example1;

public class Employees {
    
    private String name;
    private int id;
    private String department;

    public Employees(String name, int id, String department){
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName(){
        return name;
    }

}
