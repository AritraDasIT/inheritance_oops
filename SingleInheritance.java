
class Shapes{

    public void area(){

        System.out.println("Area: ");
    }
}

class Triangle extends Shapes{

    public void area(int b , int h){

        double c = (.05*b*h);

        System.out.println(c);
    }
}

public class SingleInheritance {

    public static void main(String args[]) {

        Triangle t = new Triangle();

        t.area();
        t.area(2, 5);
    }

}
