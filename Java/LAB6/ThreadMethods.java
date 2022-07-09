//A program to create a new thread by extending a thread class.
// a.               	Get the current thread name
// b.              	Set the highest priority to the newly created thread
// c.               	Pause a thread for 2.5 seconds.
// d.              	Check whether the thread is in running state or not.
// e.   	Verify your newly created thread must be completed first before your main thread  is completed.

public class ThreadMethods extends Thread

{


public void run()
{

try{
      System.out.println("Current thread is "+Thread.currentThread().getName());
      sleep(2500);
}
catch(Exception e){
      System.out.println(e);
}

}

public static void main(String args[])
{

ThreadMethods t1= new ThreadMethods();
ThreadMethods t2= new ThreadMethods();
ThreadMethods t3= new ThreadMethods();

System.out.println("t1 default name "+t1.getName());
System.out.println("t2 default name "+t2.getName());
System.out.println("t3 default name "+t3.getName());


System.out.println("t1 default priority "+t1.getPriority());
System.out.println("t2 default priority "+t2.getPriority());
System.out.println("t3 default priority "+t3.getPriority());

t1.setName("first");
t2.setName("second");
t3.setName("third");

t1.start();
t2.start();
t3.start();


t1.setPriority(2);
t2.setPriority(5);
t3.setPriority(8);

System.out.println("t1 thread priority : "+ t1.getPriority());
System.out.println("t2 thread priority : "+ t2.getPriority());
System.out.println("t3 thread priority : "+ t3.getPriority());


System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());
System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
Thread.currentThread().setPriority(8);
System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
t3.setName("third");
      }
}
