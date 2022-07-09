class MyThread extends Thread {

    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " is running");
            sleep(2500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class Threads extends Thread {

    public static void main(String args[]) {
        System.out.println("Current thread is " + Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        System.out.println("T1 ->" + t1.isAlive());
        t1.start();
        try {
            System.out.println("T1->" + t1.isAlive());
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}