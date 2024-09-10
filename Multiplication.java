package Multithreading;

class Multiplication extends Thread{
    public void run(){
        int n=10;
        for(int i=1;i<=n;i++){
            int c =i*2;
            System.out.println(i+"*2:"+c);
            try{Thread.sleep(100);} catch(Exception e){}
        }
    }
}

class Addition extends Thread{
    public void run(){
        int n=10,c=0;
        for (int i=0;i<=n;i++){
            c=c+3;
            System.out.println(i+"+3:"+c);
            try{Thread.sleep(200);}catch(Exception e){}
        }
    }
}
class Main{
    public static void main(String[] args) {
        Multiplication m1=new Multiplication();
        Addition a1=new Addition();

        //Here we are starting the Thread to perform the action
        m1.start();
        a1.start();

    }
}