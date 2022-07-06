//  Write a thread program to demonstrate stop(), sleep(), isAlive () and join ().
public class Tjoin extends Thread {

    public void run() {

        for (int i = 0; i <= 3; i++) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {

        Tjoin t1 = new Tjoin();
        Tjoin t2 = new Tjoin();

        t1.start();
        System.out.println("t1 is alive " + t1.isAlive());
        try {
            t1.join();

        } catch (Exception e) {
            System.out.println(e);

        }
        t1.stop();
        t2.start();

        System.out.println("t2  is alive " + t2.isAlive());

    }

}
