package courses.com;

public class Main {

    public static void main(String[] args) {

        int a=10;
        int b=23;
        int res;

        res=getSum (a,b);

        System.out.println(res);

    }

    static  int getSum ( int a, int b) {
                int res;
                res= (a + b) * a;
                return res;
    }
}
