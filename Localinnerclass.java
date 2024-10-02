//LOCAL INNER CLASS

/* 
class outclass{
    void outmethod(){
        System.out.println("this is outerclass");
    }
        class innerclass{
            void innermethod(){
                System.out.println("this is inner class");
            }
        }
    
}

public class A{
    public static void main(String args[]){
        outclass out=new outclass();
        out.outmethod();
        outclass.innerclass in=out.new innerclass();
        in.innermethod();
        }
}
