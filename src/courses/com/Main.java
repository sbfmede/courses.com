package courses.com;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int t=3;
        System.out.println("Start");
        if (t>5){
            System.out.println(t >5);
            t++;
            System.out.println(t);
        }
        else {
            System.out.println("t <= 5");
                    t--;
            System.out.println(t);
        }
        System.out.println("End");

        String name[]=new String[3];
        int[] arr = new int[10];

        name[0]="Tutut";
        name[1]="Rara";
        name[2]="Kolo";

        System.out.println(name[1]);

        arr[0]=13;
        arr[3]=65;
        arr[07]=54;

        System.out.println(arr[07]);

        int[]mert ={12,35,76};

        for (int i=0;i<3;i++) {
            System.out.println(mert[i]);
        }

        int a=10;
        int b=23;
        int c= 15;
        int res;

        a=34;
        b=56;
        c=6;

        res=getSum (a,b,c);

        System.out.println(res);


        int[] terr = new int[3];

        for (int j = 0 ; j < 3; j++) {
            terr[j]= j * 2;
            System.out.println(terr[j]);
        }

        System.out.println();
        System.out.println(terr.length);

        System.out.println(terr.length-1);

    }

    static  int getSum ( int a, int b, int c) {
                int res;
                res= (a + b) * a/c;
                return res; //just to learn about methods
    }


}
