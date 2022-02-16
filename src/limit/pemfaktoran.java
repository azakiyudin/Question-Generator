package limit;
import classmath.cPangkat;
import classmath.cPecahan;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class pemfaktoran {
    public static void main(String[] args){

        //lim x-a (x-a)(a1x^2+b1x+c1)/(x-a)(a2x+b2)


        try {
            FileWriter myWriter = new FileWriter("500.txt");
            FileWriter KJ = new FileWriter("KJ500.txt");
            int i = 1;
            while(i<=500) {
                int a,a1,a2,b1,b2,c1,m,n,o,p,q;
                a = (int) (Math.random()*14-7);
                a1 = (int) (Math.random()*10-5);
                b1 = (int) (Math.random()*30-15);
                c1 = (int) (Math.random()*40-20);
                a2 = (int) (Math.random()*10-5);
                b2 = (int) (Math.random()*20-10);
                m = b1-a*a1;
                n = c1-a*b1;
                o = -a*c1;
                p = b2-a*a2;
                q = -a*b2;
//                int hasil = (a1*a*a*a + m*a*a + n *a +o);
//                int hasil2 = (a2*a*a + p*a+q);
                int hasil3 = a1*a*a + b1*a +c1;
                int hasil4 = a2*a + b2;
                String pembilang = cPangkat.a0(a1,3) + cPangkat.an(m,2) + cPangkat.an(n,1)+ cPangkat.nol(o);
                String penyebut = cPangkat.a0(a2,2) + cPangkat.an(p,1) + cPangkat.nol(q);
                String pembilang1 = "(x" + cPangkat.nol(-a) + ")(" +cPangkat.a0(a1,2) + cPangkat.an(b1,1) + cPangkat.nol(c1) + ")";
                String penyebut1 = "(x" + cPangkat.nol(-a) + ")(" +cPangkat.a0(a2,1) + cPangkat.nol(b2) + ")";
                String pembilang2 = "(" +cPangkat.a0(a1,2)+cPangkat.an(b1,1)+cPangkat.nol(c1) + ")";
                String penyebut2 = "(" + cPangkat.a0(a2,1) +cPangkat.nol(b2) + ")";
                if(hasil4 != 0 && a1 != 0 && a2!= 0) {
                    myWriter.write("\\item $\\displaystyle \\lim_{x\\rightarrow" + a + "} \\dfrac{"+ pembilang + "}{" + penyebut
                            + "}$");
                    myWriter.write("\n");
                    KJ.write("\\item $\\displaystyle \\lim_{x\\rightarrow" + a + "} \\dfrac{"+ pembilang + "}{" + penyebut +
                            "} = \\lim_{x\\rightarrow" + a+ "} \\dfrac{" + pembilang1 +"}{" + penyebut1+
                            "} = \\lim_{x\\rightarrow" + a+ "} \\dfrac{" + pembilang2 +"}{" + penyebut2+"} = " +
                            cPecahan.simpel(hasil3,hasil4) +"$");
                    KJ.write("\n");
                    i++;
                }
            }
            myWriter.close();
            KJ.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
