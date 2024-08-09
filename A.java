/*public class A{
    int x=5;
    char a='B';

    static int Test(int n1,int n2){
        return n1+n2;
    }
    static String Test(String a1,String a2){
        return a1+a2;
    }
    public static void main(String[] args) {
        int K=Test(23,5);
        System.out.println(K);
        String E=Test("Kousi", "Eni");
        System.out.println(E);
    }
}
*/

//TEST EXAMPLE
/*  
public class A{
    private String name;
    private int age;

   A(String name,int age){
        this.name=name;
        this.age=age;

    }
   void display(){
    System.out.println("this is me :"+name);
    System.out.println("this is my age :"+age);
   }
   public static void main(String[] args){
    A a1=new A("kousimon",17);
    a1.display();
   }
}
*/


//ENUM EXAMPLE
/* 
enum level{
    begginer,intermediate,advanced,expert;
    private String abre;
    level (String ab){
        abre=ab;
    }
    StrigetAbre(){
        return abre;
    }
    public class A{
        
    }
}

*/

//method overloading
/* 
class Animal{
    public void  makesound(){
        System.out.println("the animal makes a sound");
    }}
    class Dog extends Animal{
        public void makesound(){
            System.out.println("dogs always bark");
        }
    }
    public class A{
        public static void main(String args[]){
            Animal an=new Animal();
            Dog dog=new Dog();
            an.makesound();
            dog.makesound();
        }
    }
*/


//hiding fields
/* 
class Animal{
    public String name="Jimmy";
}
class Dog extends Animal{
    public String name="Dog";
    public void printname(){
        System.out.println("Animal name:"+name);
        System.out.println("Dog name:"+super.name);
    }
}
public class A{
    public static void main(String args[]){
        Dog dog=new Dog();
        dog.printname();
    }
}
*/

//INTERFERENCE
/* 
interface Animal{
    public void animalsound();
    public void sleep();
}
class cat implements Animal{
    public void animalsound(){
        System.out.println("cat says meow meow");
    }
    public void sleep(){
        System.out.println("sleeps silently");
    }
}
public class A{
    public static void main(String args[]){
        cat sound=new cat();
        sound.animalsound();
        sound.sleep();
    }
}
*/
/* 
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}

*/

//LOCAL INNER CLASS

/* 
class outclass{
    void outmethod(){
        System.out.println("this is outerclass");
    }
        class innerclass{
            void innermethod(){
                System.out.println("this is inner class");
            }
        }
    
}

public class A{
    public static void main(String args[]){
        outclass out=new outclass();
        out.outmethod();
        outclass.innerclass in=out.new innerclass();
        in.innermethod();
        }
}

*/

//EXCEPTION HANDLING

//TRY AND CATCH

/* 
public class A{
    public static void main(String args[]){
        try{
        int[] mynumber={1,2,3};
        System.out.println(mynumber[11]);
        }
        catch(Exception e){
            System.out.println("something went wrong"); 
        }
        finally{
            System.out.println("this must be something else");
        } 
        }
    }
    */

//TRY THROW CATCH

/* 
import java.util.Scanner;
public class A{
    static void checkage(int age){
        if (age>18){
            throw new ArithmeticException("Access denied - your age is lower than 18");
        }
        else{
            System.out.println("you are qualified for voting");
        }
    }
    public static void main(String args[]){
        checkage(19);
    }
}
*/


//ASSERTION
/* 
public class A{
    public static void main(String args[]){
        int x=5;
        assert x==5;
    }
}
*/


//USER DEFINED EXCEPTION
/* 
public class A{
    public static void main(String args[]){
        try{
            int[] num={1,2,3,4};
            System.out.println(num[6]);
            throw new IndexOutOfBoundsException("Access denied- you cannot enter this code");
        }
        catch(Exception e){
            System.out.println("something went wrong");
            System.out.println(e);
        }
        finally{
            System.out.println("you're code is completed");
        }
    }
}

*/

//CONCATINATION
/* 
public class A{
    public static void main(String args[]){
        String n1="kousi";
        String n2="mon";
        System.out.println(n1.concat(n2));
       }
}

*/


//SRTINGS INSIDE STRING
/* 
public class A{
    public static void main(String args[]){
        System.out.println("vikings are the ,\"best\" of all at that time");
    }
}
*/

//CONSOLE
/* 
import java.io.Console;

public class A{
    public static void main(String args[]){
        Console con=System.console();
        String input=con.readLine("enter the line:");
        con.printf("this the word:"+input);
    }
}

*/

//FILE HANDLING


//CALCULATOR
/* 
import java.io.Console;
import java.util.Scanner;

class cal{
    static void add(){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the first number:");
        int a=obj.nextInt();
        System.out.print("enter the second number:");
        int b=obj.nextInt();
        int c=a+b;
        System.out.println(c);
    
    }
    static void mul(){
         Scanner obj=new Scanner(System.in);
        System.out.print("enter the first number:");
        int a=obj.nextInt();
        System.out.print("enter the second number:");
        int b=obj.nextInt();
        int c=a*b;
        System.out.println(c);
    }
    static void sub(){
         Scanner obj=new Scanner(System.in);
        System.out.print("enter the first number:");
        int a=obj.nextInt();
        System.out.print("enter the second number:");
        int b=obj.nextInt();
        int c=a-b;
        System.out.println(c);
    }
    static void div(){
         Scanner obj=new Scanner(System.in);
        System.out.print("enter the first number:");
        int a=obj.nextInt();
        System.out.print("enter the second number:");
        int b=obj.nextInt();
        int c=a/b;
        System.out.println(c);
    }

    public static void main(String args[]){       
        Scanner ob=new Scanner(System.in);
        System.out.print("enter the number:");
        int a=ob.nextInt();
        cal obj=new cal();
        switch(a){
            case 1:
            obj.add();
            break;
            case 2:
            obj.mul();
            break;
            case 3:
            obj.sub();
            break;
            case 4:
            obj.div();
            break;
        }
    
        }
    }
*/

//MULTITHREADING
/* 
class book implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Updating db");
            try{Thread.sleep(500);}catch(Exception e){}
        }
     }
}*/ 


/* 
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
*/

//Synchronized
/* 
class Table{
    void printtable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class A{
    public static void main(String args[]){
        Table t=new Table();

        Thread t1=new Thread(){
            public void run(){
                t1.printTable(5);
            }
        };


    }
}
*/

//GENERICS

import java.util.TreeSet;

public class A{
    public static void main(String[] args){
        int[] ar=new int[5];
        ar[1]=2;
        ar[0]=1;
        /*ar[2]=3;
        ar[3]=4;
        ar[4]=5;
        for(int i=0;i<=4;i++){
            System.out.println(ar[i]);
        }*/

        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(12);
        ts.add(4);
        ts.add(0);
        
        
    }
}