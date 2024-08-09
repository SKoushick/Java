import java.util.Scanner;
/*public class Kousi{
    public static void smpl(String[] args){
        int a,c;
        Scanner obj=new Scanner(System.in);
        System.out.print("enter number 1:");
        a=obj.nextInt();
        System.out.print("enter number 2:");
        c=obj.nextInt();
        System.out.println("this is first number:"+a);
        System.out.println("this is second number:"+c);

    }
    public static void main(){
        Demo a=new Kousi();
        System.out.println(a.smpl());
    }
}*/

public class Kousi{
    public static void main(String[] args){
        int a=3,b=5,c=9;
      /*   Scanner obj=new Scanner(System.in);
        System.out.println("enter a:");
        a=obj.nextInt(a);
        System.out.println("enter b:");
        b=obj.nextInt(b);
        System.out.println("enter c:");
        c=obj.nextInt(c);*/
        if(a<b & a<c){
            System.out.println("a is bigger one");
        }        
        else if (b<a & b<c){
            System.out.println("b is bigger one");
        }
        else if(c<a & c<b){
            System.out.println("c is bigger one");
        }
        else{
            System.out.println("no one is bigger");
        }
        
    }
}