public class Inheritence{
    static int x=10;
void start(){
        In_class in=new In_class();
        in.display(); 
    }

    class In_class{
        void display(){
        System.out.println(x);
        
    }
}
public class Main{
 
 public static void main(String args[]){
    Inheritence In=new Inheritence();
    In.start();
    }
}
}
