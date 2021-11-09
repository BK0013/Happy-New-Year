package automationtest;

public class IfThenElse5 {
    public boolean isTeen(int age){
        if (age<=18){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        IfThenElse1 obj = new IfThenElse1 ();
        System.out.println(obj.isTeen(12));
        System.out.println(obj.isTeen(30));
    }
}
