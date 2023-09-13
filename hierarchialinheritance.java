import java.util.*;
class Shape{
    public void area(){

        System.out.println("Display area: ");
    }
}

class Rectangle extends Shape{

    public void area(int a , int b){

        int c = (a*b);

        System.out.println(c);
    }
}

class Circle extends Shape{

    public void area(int r){

        double d = (3.14*r*r);

        System.out.println(d);
    }
}





public class hierarchialinheritance {

    public static void main(String args[]){

        Rectangle r = new Rectangle();

        Circle c = new Circle();

        r.area();
        r.area(2,4);

        c.area(2);


    }
}

