package Multithreading;

class Even extends Thread{
    public void run(){
        int n=10;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println("Even:"+i);
        }
        try{Thread.sleep(500);} catch(Exception e){}

        }
    }
}

class Odd extends Thread{
    public void run(){
        int n=10;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println("Odd:"+i);
        }
        try{Thread.sleep(500);} catch(Exception e){}

        }
    }
}

class EvenOdd{
    public static void main(String[] args) {
        Even e1=new Even();
        Odd o1=new Odd();

        e1.start();
        o1.start();

    }
}