//USER DEFINED EXCEPTION
/* 
public class A{
    public static void main(String args[]){
        try{
            int[] num={1,2,3,4};
            System.out.println(num[6]);
            throw new IndexOutOfBoundsException("Access denied- you cannot enter this code");
        }
        catch(Exception e){
            System.out.println("something went wrong");
            System.out.println(e);
        }
        finally{
            System.out.println("you're code is completed");
        }
    }
}
