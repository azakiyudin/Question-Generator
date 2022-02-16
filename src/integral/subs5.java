package integral;

import classmath.cAcak;
import classmath.cPangkat;
import classmath.cPecahan;

import java.io.FileWriter;
import java.io.IOException;

public class subs5 {
    public static void main(String[] args){
        try {
            FileWriter soal = new FileWriter("int sub5.txt");
            FileWriter kj = new FileWriter("kjsub5.txt");
            int i = 1;
            while(i<=1000) {
                int n1 = cAcak.rnd(6);
                int n = n1;
                int a = cAcak.rnd(3);
                int k = cAcak.rnd(9);
                if(a> 0 && n>=2) {
                    StringBuilder fogx = new StringBuilder(cPangkat.a0(a, n1));
                    int c = n1 * a * k;
                    StringBuilder gaksenx = new StringBuilder(cPangkat.a0(c, n1 - 1));
                    while (n > 1) {
                        n--;
                        a = cAcak.rnd(3);
                        if (a != 0) {
                            fogx.append(cPangkat.an(a, n));
                            if (n > 1) {
                                gaksenx.append(cPangkat.an(n * a * k, n - 1));
                            } else if (n == 1) {
                                gaksenx.append(cPangkat.nol(n * a * k));
                            }
                        }
                    }
                    a = cAcak.rnd(3);
                    fogx.append(cPangkat.nol(k * a));
                    int pgkt = cAcak.rnd(4);
                    if (pgkt > 1) {
                        String koef = cPecahan.simpel(k * pgkt, pgkt - 1);
                        if(koef.equals("-1")){
                            koef = "-";
                        } else if(koef.equals("1")){
                            koef = "";
                        }
                        String jwb;
                        if (pgkt > 2) {
                            jwb = koef + "\\sqrt[" + pgkt + "]{\\left(" + fogx + "\\right)^{" + (pgkt - 1) + "}} + C";
                            soal.write("\\item $\\displaystyle \\int \\dfrac{" + gaksenx + "}{\\sqrt[" + pgkt + "]{" + fogx + "}}\\, \\, dx = \\cdots $");
                        } else {
                            jwb = koef + "\\sqrt{" + fogx + "} + C";
                            soal.write("\\item $\\displaystyle \\int \\dfrac{" + gaksenx + "}{\\sqrt{" + fogx + "}}\\, \\, dx = \\cdots$");
                        }
                        soal.write("\n");
                        i++;
                        kj.write("\\item $\\displaystyle " + jwb + "$\n");
                    }
                }
            }
            kj.close();
            soal.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
