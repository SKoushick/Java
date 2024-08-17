Public class Sample{
    int x=5;
    char a='B';

    static int Test(int n1,int n2){
        return n1+n2;
    }
    static String Test(String a1,String a2){
        return a1+a2;
    }
    public static void main(String[] args) {
        int K=Test(23,5);
        System.out.println(K);
        String E=Test("Kousi", "Eni");
        System.out.println(E);
    }
}







