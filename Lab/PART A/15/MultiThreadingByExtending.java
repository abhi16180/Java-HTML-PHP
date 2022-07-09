// Write a program for creating three threads 
// By extending Thread class

class MultiThreadingByExtending extends Thread{


    public void run(){
        System.out.println("Current thread is"+Thread.currentThread().getName());
    }

    public static void main(String args[]){
        MultiThreadingByExtending t1= new MultiThreadingByExtending();
        MultiThreadingByExtending t2= new MultiThreadingByExtending();
        MultiThreadingByExtending t3= new MultiThreadingByExtending();
        t1.start();
        t2.start();
        t3.start();
    }
}