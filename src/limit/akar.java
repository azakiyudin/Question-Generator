package limit;

import classmath.cPangkat;
import classmath.cPecahan;

import java.io.FileWriter;
import java.io.IOException;

public class akar {
    public static void main(String[] args){

        //lim x-a (x-a)(a1x^2+b1x+c1)/(sqrt(a2x+b2)-c2)


        try {
            FileWriter myWriter = new FileWriter("akarya.txt");
            FileWriter KJ = new FileWriter("KJakarya.txt");
            int i = 1;
            while(i<=10) {
                int a,a1,a2,b1,b2,c1,c2,m,n,o,t;
                a = (int) (Math.random()*14-7);
                a1 = (int) (Math.random()*10-5);
                b1 = (int) (Math.random()*30-15);
                c1 = (int) (Math.random()*40-20);
                a2 = (int) (Math.random()*10-5);
                c2 = (int) (Math.random()*10-10);
                b2 = c2*c2-a2*a;
                m = b1-a*a1;
                n = c1-a*b1;
                o = -a*c1;
                t = (int)Math.sqrt(a*a2+b2)-c2;
                int hasilpem = (a1*a*a + b1*a +c1)*t;
                int hasilpeny = a2;
                String pembilang = cPangkat.a0(a1,3) + cPangkat.an(m,2) + cPangkat.an(n,1)+ cPangkat.nol(o);
                String penyebut = "\\sqrt{" + cPangkat.a0(a2,1) + cPangkat.nol(b2)+"} " + cPangkat.nol(c2);
                String pembilang1 = "(" +cPangkat.a0(a1,2)+cPangkat.an(b1,1)+cPangkat.nol(c1) + ")" +
                        "(\\sqrt{" + cPangkat.a0(a2,1) + cPangkat.nol(b2) + "}" + cPangkat.nol(-c2) + ")";
                String penyebut1 = Integer.toString(a2);
               if(hasilpeny != 0 && a1 != 0 && c2!= 0) {
                    myWriter.write("\\item $\\displaystyle \\lim_{x\\rightarrow " + a + "} \\dfrac{"+ pembilang + "}{" + penyebut
                            + "}=\\cdots $");
                    myWriter.write("\n");
                    KJ.write("\\item $\\displaystyle \\lim_{x\\rightarrow " + a + "} \\dfrac{"+ pembilang + "}{" + penyebut +
                            "} = \\lim_{x\\rightarrow " + a+ "} \\dfrac{" + pembilang1 +"}{" + penyebut1+
                            "} = " +
                            cPecahan.simpel(hasilpem,hasilpeny) +"$");
                    KJ.write("\n");
                    i++;
                }
            }
            i = 1;
            while(i<=10) {
                int a,a1,a2,b1,b2,c1,c2,m,n,o,t;
                a = (int) (Math.random()*14-7);
                a1 = (int) (Math.random()*10-5);
                b1 = (int) (Math.random()*30-15);
                c1 = (int) (Math.random()*40-20);
                a2 = (int) (Math.random()*10-5);
                c2 = (int) (Math.random()*10-10);
                b2 = c2*c2-a2*a;
                m = b1-a*a1;
                n = c1-a*b1;
                o = -a*c1;
                t = (int)Math.sqrt(a*a2+b2)-c2;
                int hasilpeny = (a1*a*a + b1*a +c1)*t;
                int hasilpem = a2;
                String penyebut = cPangkat.a0(a1,3) + cPangkat.an(m,2) + cPangkat.an(n,1)+ cPangkat.nol(o);
                String pembilang = "\\sqrt{" + cPangkat.a0(a2,1) + cPangkat.nol(b2)+"} " + cPangkat.nol(c2);
                String penyebut1 = "(" +cPangkat.a0(a1,2)+cPangkat.an(b1,1)+cPangkat.nol(c1) + ")" +
                        "(\\sqrt{" + cPangkat.a0(a2,1) + cPangkat.nol(b2) + "}" + cPangkat.nol(-c2) + ")";
                String pembilang1 = Integer.toString(a2);
                if(hasilpeny != 0 && a1 != 0 && a2 !=0 && c2!= 0) {
                    myWriter.write("\\item $\\displaystyle \\lim_{x\\rightarrow " + a + "} \\dfrac{"+ pembilang + "}{" + penyebut
                            + "}=\\cdots $");
                    myWriter.write("\n");
                    KJ.write("\\item $\\displaystyle \\lim_{x\\rightarrow " + a + "} \\dfrac{"+ pembilang + "}{" + penyebut +
                            "} = \\lim_{x\\rightarrow " + a+ "} \\dfrac{" + pembilang1 +"}{" + penyebut1+
                            "} = " +
                            cPecahan.simpel(hasilpem,hasilpeny) +"$");
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
