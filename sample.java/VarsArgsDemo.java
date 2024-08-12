public class VarsArgsDemo{
    static int minvalue(int... vals){
        int min = Integer.MAX_VALUE;
        for(int k:vals){
            if(k<min){
                min=k;
            }
        }
        return min;
    }
    


public static void main(String args[]){
    int m=minvalue(5,6,7,8);
    System.out.println(m);
    int n=minvalue(9,8,7,6,5,3,1);
    System.out.println(n);
}

}