//MULTITHREADING

class book implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Updating db");
            try{Thread.sleep(500);}catch(Exception e){}
        }
     }
}



class table extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
             try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}

public class A{
    public static void main(String args[]){
        Runnable obj1=() -> {
            
        for(int i=1;i<=5;i++){
            System.out.println("Updating db");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    
        };           //Runnable must be given to the object
        table obj2=new table();

        Thread t1=new Thread(obj1);                //thread method must be given the object to be run

        t1.setName("No.1");
        t1.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(t1.getPriority());
        t1.start();                                //obj of thread will strat execute the program
        obj2.start();

        

         if(obj1.isAlive()){
            System.out.println("book is Running");
        }
        else{
            System.out.println("book is Stopped");
        }if(obj2.isAlive()){
            System.out.println("table is Running");
        }
        else{
            System.out.println("table is Stopped");
        }

        

        try {obj1.join();} catch (InterruptedException e) {}
           
        try {obj2.join();} catch (InterruptedException e) {}

        if(obj1.isAlive()){
            System.out.println("book is Running");
        }
        else if(obj2.isAlive()){
            System.out.println("table is running");
        }
        else{
            System.out.println("both Stopped");
        }
        
    }
}
