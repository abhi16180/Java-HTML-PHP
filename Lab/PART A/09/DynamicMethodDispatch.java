


 class A{
    void disp(){
        System.out.println("Inside class A");
    }
 

}

class B extends A{
    void disp(){
        System.out.println("Inside class B");
    }
}


public class DynamicMethodDispatch extends A {

    void disp(){
        System.out.println("Inside DynamicMethodDispatch class");
    }
    
    public static void main(String args[]){
        A ref;
        ref= new A();
        ref.disp();
        ref= new B();
        ref.disp();
        ref= new DynamicMethodDispatch();
        ref.disp();
    }
}
