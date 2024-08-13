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


*/




*/





*/

//FILE HANDLING


