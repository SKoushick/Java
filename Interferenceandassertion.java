//INTERFERENCE

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




//ASSERTION
/* 
public class A{
    public static void main(String args[]){
        int x=5;
        assert x==5;
    }
}
