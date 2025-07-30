//EXCEPTION HANDLING

//TRY AND CATCH


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
}//USER DEFINED EXCEPTION
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
