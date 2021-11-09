package automationtest;

public class Variable3 {
    int id;
    String name;

    public Variable3( int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("This is id " + id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Variable1 obj = new Variable1 (101, "Bharat");
        obj.display();

        Variable1 obj1 = new Variable1 (102, "Wellness");
        obj1.display();
    }


}
