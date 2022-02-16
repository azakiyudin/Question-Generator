package fungsikomposisi;

public class tipe1 {
    public static void main(String args[]){

        int a, b, c, d;
         //f(x)=ax+b
        //f(x)=cx+d

        for(int i=1; i<=10;i++) {
            int m, n;
            a = (int) (Math.random() * 40 - 20);
            b = (int) (Math.random() * 40 - 20);
            c = (int) (Math.random() * 40 - 20);
            d = (int) (Math.random() * 40 - 20);

            m = a * c;
            n = a * d + b;

            System.out.println("===============");
            System.out.println("f(x) = " + a + "x + " + b);
            System.out.println("g(x) = " + c + "x + " + d);
            System.out.println("(fog)(x) = " + m + "x + " + n);
        }
    }
}
