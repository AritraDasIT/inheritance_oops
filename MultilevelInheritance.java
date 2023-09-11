class one{
    public void display(){

        System.out.print("I");
    }
}

class two extends one{

    public void p_display(){

        System.out.print(" am");
    }
}

class three extends two{

    public void q_display(){

        System.out.print(" Aritra");
    }
}



public class MultilevelInheritance {
    public static void main(String args[]){

        three t = new three();

        t.display();
        t.p_display();
        t.q_display();
    }
}
