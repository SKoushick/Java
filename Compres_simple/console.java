//CONSOLE

import java.io.Console;

public class A{
    public static void main(String args[]){
        Console con=System.console();
        String input=con.readLine("enter the line:");
        con.printf("this the word:"+input);
    }
}
