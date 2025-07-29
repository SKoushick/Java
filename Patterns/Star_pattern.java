package Patterns;

public class Star_pattern {
    public static void main(String[] args){
        pattern7(5);
    }

    //Right triangle
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

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
        for(int row=1;row<=n;row++){
            for(int column = 1;column<=row;column++){
                System.out.print(column);
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
}