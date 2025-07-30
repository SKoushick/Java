import java.util.Scanner();
class Box{
  int a,b,c;
  
  static int boxcount;
  
  Box(){
    int a=10;
    int b=12;
    int c=15;
    boxcount++;
  }

  Box(int q,int e,int o){
    a=q;
    b=e;
    c=o;
    boxcount++;
  }

  static void Box(){
    boxcount=0;
  }
  
  Box(int t){
    if(a==t && b==t && c==t)
      return TRUE;
    return FALSE;
    boxcount++;
  }

  int volume(){
    return a*b*c;
  }
}

Public class Main{
  public static void main(){
    Scanner A=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter the value for a:");
    a=A.nextInt();
    System.out.println("Enter the value for b:");
    b=A.nextInt();
    System.out.println("Enter the value for c:");
    c=A.nextInt();
    
    Box Blackbox=new Box();
    
    Blackbox.Box(a);
    System.out.println(Blackbox.volume());
    Blackbox.Box(b,a);
    System.out.println(Blackbox.volume());
    Blackbox.Box();
    System.out.println(Blackbox.volume());
    

    Box Brownbox=new Box();
    Brownbox.Box(2,4);
    System.out.println(Brownbox.volume());
    Brownbox.Box(9);
    System.out.println(Brownbox.volume());
    Brownbox.Box();
    System.out.println(Brownbox.volume());
  }
}
