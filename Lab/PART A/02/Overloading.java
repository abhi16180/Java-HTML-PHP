

public class Overloading {
    Overloading() {
        System.out.println("Hey there");
    }

    Overloading(String s) {
        System.out.println("Hello ," + s);
    }

    void display(String s) {
        System.out.println(s);
    }

    void display(String s, String p) {
        System.out.println(s + p);
    }

    public static void main(String args[]) {
        // constructor overloading
        Overloading obj1 = new Overloading();
        Overloading obj2 = new Overloading("Matrix");
        //method overloading
        obj1.display("Display funtion with one argumennt");
        obj1.display("Display funtion", "with two arguments");
    }

}
