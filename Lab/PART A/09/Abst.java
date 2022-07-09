
abstract class A{
    abstract void disp();
}

public class Abst  extends A{

    void disp(){
        System.out.println("Body of disp defined here");
    }
    public static void main(String args[]){
        Abst obj= new Abst();
        obj.disp();
    }
}
