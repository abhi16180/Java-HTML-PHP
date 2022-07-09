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

class Main extends Thread {

    public static void main(String args[]) {
        System.out.println("Current thread is " + Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        System.out.println("is t1 Alive ?" + t1.isAlive());
        t1.setPriority(10);
        t1.start();
        try {
            System.out.println("priority "+ t1.getPriority());
            System.out.println("is t1 Alive ?" + t1.isAlive());
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Is t1 Alive?"+t1.isAlive());
        System.out.println("Is main Alive?"+Thread.currentThread().isAlive());
    }
}
