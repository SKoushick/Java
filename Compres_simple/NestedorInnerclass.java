class Innerclass{
    static int x=10,y=20;
    

    void start(){
        In_class in=new In_class();
        in.display(); 
    }

    class In_class{
        void display(){
        System.out.println(x);
        
    }
}
public class Main extends Innerclass{
    static void Sum(){
        System.out.println(x+y);
    }

    public static void main(String args[]){
    
        Main.Sum();
    }
}
}
