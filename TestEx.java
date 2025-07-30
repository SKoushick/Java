//TEST EXAMPLE

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
