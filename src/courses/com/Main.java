package courses.com;

public class Main {

    public static void main(String[] args) {

        int a=10;
        int b=23;
        int c= 15;
        int res;

        a=34;
        b=56;
        c=6;

        res=getSum (a,b,c);

        System.out.println(res);

    }

    static  int getSum ( int a, int b, int c) {
                int res;
                res= (a + b) * a/c;
                return res; //just to learn about methods
    }
}
