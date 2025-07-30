//method overloading

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






