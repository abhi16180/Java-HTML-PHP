// Assume  that  only  one  copy  of  the  book  is  available  in Amazon 
// and  four  customers  are trying  to  place  the  order for book  at 
// the same  time. Write  a java  program  using  threads  which  prints
// book  confirmed  for  one  person  and  “out  of stock” for others.
class Amazon extends Thread {
    static int availableItems = 1;

    synchronized public void run() {

        if (availableItems > 0) {
            --availableItems;
            System.out.println("Booked for " + Thread.currentThread().getName());
        } else {
            System.out.println("Out of stock");
        }
    }

    public static void main(String args[]) {
        Amazon u1 = new Amazon();
        Amazon u2 = new Amazon();
        Amazon u3 = new Amazon();
        Amazon u4 = new Amazon();
        u1.start();
        u2.start();
        u3.start();
        u4.start();
    }
}