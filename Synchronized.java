
//Synchronized
 
class Table{
    void printtable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class A{
    public static void main(String args[]){
        Table t=new Table();

        Thread t1=new Thread(){
            public void run(){
                t1.printTable(5);
            }
        };


    }
}


