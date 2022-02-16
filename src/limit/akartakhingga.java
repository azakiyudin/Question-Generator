package limit;

import classmath.cPecahan;
import classmath.cPolinom2;

import java.io.FileWriter;
import java.io.IOException;

public class akartakhingga {
    public static void main(String[] args){

        //lim x-inf \sqrt(ax^2+bx+c) - (mx+n)


        try {
            FileWriter myWriter = new FileWriter("bentuk akar.txt");
            FileWriter kunci = new FileWriter("kunci akar.txt");
            //bentuk sqrt(ax^2+bx+c)-mx+n
            for(int i = 0; i<250;i++) {
                int a, b, m, q;
                cPolinom2 p1 = new cPolinom2(1, '-');
                m = p1.getano(1);
                cPolinom2 p2 = new cPolinom2(m*m,2);
                a = p2.getano(2);
                b = p2.getano(1);
                q = 2 * p1.getano(1) * p1.getano(0);
                String kode = "\\item $\\displaystyle \\lim_{x\\rightarrow \\infty}\\left(\\sqrt{" +
                        p2.getPolinom() + "}" + p1.getPolinom() + "\\right) = ...$\n";
                myWriter.write(kode);
                if (a > m * m) {
                    kunci.write("\\item $\\infty$\n");
                } else if (a == m * m) {
                    kunci.write("\\item $" + hasil(a, b, q) +"$\n");
                } else{
                    kunci.write("\\item $-\\infty$\n");
                }
            }
            //bentuk mx+n-sqrt(ax^2+bx+c)
            for(int i = 0; i<250;i++) {
                int a,b,m,q;
                cPolinom2 p1 = new cPolinom2(1,'+');
                m = p1.getano(1);
                cPolinom2 p2 = new cPolinom2(m*m,2);
                a = p2.getano(2);
                q = p2.getano(1);
                b = 2*p1.getano(1)*p1.getano(0);
                String kode = "\\item $\\displaystyle \\lim_{x\\rightarrow \\infty}\\left(" + p1.getPolinom()+"-\\sqrt{" +
                        p2.getPolinom()+"}\\right) = ...$\n";
                myWriter.write(kode);
                if (a < m * m) {
                    kunci.write("\\item $\\infty$\n");
                } else if (a == m * m) {
                    kunci.write("\\item $" + hasil(a, b, q) +"$\n");
                } else{
                    kunci.write("\\item $-\\infty$\n");
                }
            }

            myWriter.close();
            kunci.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static String hasil(int a, int b, int q){
        int pembilang = b-q;
        int penyebut = (int) (2*Math.sqrt(a));
        return cPecahan.simpel(pembilang,penyebut);
    }
}
