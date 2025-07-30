//hiding fields

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
