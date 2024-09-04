package TheadingConcept;

//class Book implements Runnable {                                         //Interface in Threading

//}

class Num extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("this is Number:" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] agrs) throws InterruptedException {
        Runnable book = () -> { // Anonymus Functio
            for (int i = 0; i < 5; i++) {
                System.out.println("Update DB");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }

        };

        // Book obj1 = new Book();
        Num obj2 = new Num();

        obj2.start();
        // obj1.start();

        /*
         * if (obj1.isAlive()) {
         * System.out.println("Still Running");
         * }
         * 
         * obj1.join();
         */

        Thread th = new Thread(book);

        th.setName("BookInterface"); // We can set the name for the annonymus function and this can be known be
                                     // printing in system.out.println
        th.start();
        th.join();
        obj2.join();

        if (obj2.isAlive()) {
            System.out.println("still executing");
        }

        System.out.println("THis is final block");
        System.out.println(th.getName()); // this is the place where we can see the name of the annonymus function
        // Thread.start();

        th.setPriority(Thread.MAX_PRIORITY);
        System.out.println(th.getPriority());

    }
}