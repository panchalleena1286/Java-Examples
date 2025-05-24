
class Car{
    private int speed;
    private int numberOfTypes;

    public void setterSpeed(int s)
    {
        speed = s;
    }

    public int getSpeed()
    {
        return speed;
    }

}

public class OOPsExample {

    public static void main(String[] args) {
        
        Car obj = new Car();
        obj.setterSpeed(80);

        System.out.println(obj.getSpeed());
    }
    
}
