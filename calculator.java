//CALCULATOR
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


