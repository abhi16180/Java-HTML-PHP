

import java.lang.Runnable;


class MultiThreadingByImpl implements Runnable{


    public void run(){
        System.out.println("Current thread is "+Thread.currentThread().getName());
    }


    public static void main(String args[]){
        MultiThreadingByImpl obj1= new MultiThreadingByImpl();
        MultiThreadingByImpl obj2= new MultiThreadingByImpl();
        MultiThreadingByImpl obj3= new MultiThreadingByImpl();
        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);
        Thread t3= new Thread(obj3);
        t1.start();
        t2.start();
        t3.start();
        
    }
}