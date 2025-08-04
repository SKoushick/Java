package Patterns;

public class Star_pattern {
    public static void main(String[] args){
        pattern17(5);
    }

    //Right triangle 
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int column = 1;column<=n;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int column = 1;column<=n-row+1;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 

    static void pattern4(int n){
        int a=0;
        for(int row=1;row<=n;row++){
            for(int column = 1;column<=row;column++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                if((row+col)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row=1;row<= 2*n-1;row++){
            int c = row > n ? 2*n -row:row; 
            for(int col=0 ; col < c ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } 

    static void patternn(int n){
        for(int row=1;row<=n;row++){
            for(int column = 1;column<=row;column++){
                System.out.print(row);
            }
            System.out.println();
        }
    } 

    static void pattern6(int n){
        for(int row=1;row<= 2*n-1;row++){
            int c = row > n ? 2*n -row:row; 

            int spaces = n-c;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int col=0 ; col < c ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern7(int n){
        for(int row=1;row<=n;row++){
            
            for(int space = 0;space <n-row;space++){
                System.out.print("  ");
            }
            for(int col =row;col>=1;col--){
                System.out.print(col + " ");
            }
            for(int col = 2;col<=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    static void pattern8(int n){
        for(int i = 1;i>=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j = 1;j<=(2*n)-2;j++){
                System.out.print(" ");
            }
            for(int j =i;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    static void pattern9(int n ){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern10(int n ){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern11(int n ){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }  

    static void pattern13(int n ){
        for(int i=n;i>=0;i--){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    } 

    static void pattern14(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(char j='A';j<='A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void pattern15(int n) {
        for (int i = n; i >= 1; i--) {       
            char ch = 'A';                   // Start with 'A'
            for (int j = 1; j <= i; j++) {   // Print up to i letters
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    static void pattern16(int n ){
        for(int i=1;i<=n;i++){
            char a= 'A';
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}