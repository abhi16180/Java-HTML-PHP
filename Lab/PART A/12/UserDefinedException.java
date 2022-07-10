
import java.lang.Throwable;

class UserDefinedException {

    public static void main(String args[]) throws MyException {

        try {
            throw new MyException("User defined exception");
        } catch (MyException e) {
            System.out.println(e.toString());
        }
    }
}

class MyException extends Exception {

    MyException(String s) {
        super(s);
    }
}
