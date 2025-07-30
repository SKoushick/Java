import java.util.Scanner;
class box{


volume(int a,int b,int c){
        int vol=a*b*c;
System.out.println("volume of the box is:"+vol);
}
} 

public class Objbox{
public static void main(String args[]){
Scanner A=new Scanner(System.in);
box BB = new box();
System.out.println("Enter the length of the box")
BB.length=A.nextInt();

System.out.println("Enter the breath of the box")
BB.breath=A.nextInt();

System.out.println("Enter the height of the box")
BB.height=A.nextInt();

System.out.println(BB.volume(BB.length,BB.breath,BB.height));}
}