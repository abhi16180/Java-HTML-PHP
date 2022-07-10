import java.lang.NullPointerException;
class ThrowsUsage {

    public static void main(String args[]) throws NullPointerException {

        try{
            throw new NullPointerException();
        }catch(NullPointerException npe){
            System.out.println("Null pointer excp ");
        }
    }
}