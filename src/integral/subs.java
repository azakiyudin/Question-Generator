package integral;

import classmath.cAcak;
import classmath.cPangkat;
import classmath.cPecahan;

import java.io.FileWriter;
import java.io.IOException;

public class subs {
    public static void main(String[] args){
        try {
            FileWriter soal = new FileWriter("int sub.txt");
            FileWriter kj = new FileWriter("kjsub1.txt");
            int i = 1;
            while(i<=1000) {
                int n1 = cAcak.rnd(8);
                int n = n1;
                int a = cAcak.rnd(3);
                int k = cAcak.rnd(9);
                if(a!= 0 && n>=2) {
                    StringBuilder gaksenx = new StringBuilder(cPangkat.a0(k*a, n1));
                    String c = cPecahan.simpel(a,n1+1);
                    StringBuilder fgx = new StringBuilder();
                    if(!c.equals("-1") && !c.equals("1")){
                        fgx.append(c);
                    } else if(c.equals("-1")){
                        fgx.append("-");
                    }
                    fgx.append(cPangkat.a0(1,n1+1));
                    while (n > 1) {
                        n--;
                        a = cAcak.rnd(3);
                        if (a!= 0) {
                            fgx.append(cPecahan.simpel2(a, (n + 1)));
                            gaksenx.append(cPangkat.an(k*a, n));
                            fgx.append(cPangkat.a0(1, n + 1));
                        }
                    }
                    a = cAcak.rnd(3);
                    gaksenx.append(cPangkat.nol(k*a));
                    fgx.append(cPangkat.an(a,1));
                    int plusc=cAcak.rnd(3);
                    if (plusc>0 ){
                        fgx.append("+");
                        fgx.append(plusc);
                    } else if(plusc<0){
                        fgx.append(plusc);
                    }
                    int pgkt = cAcak.rnd(3);
                    String koef = cPecahan.simpel(k,pgkt+1);
                    if(koef.equals("-1")){
                        koef = "-";
                    } else if(koef.equals("1")){
                        koef = "";
                    }
                    String jwb = koef + "\\left(" + fgx + "\\right)^{" + (pgkt+1) + "} + C";
                    if(pgkt > 1) {
                        soal.write("\\item $\\displaystyle \\int \\left(" + fgx + "\\right)^{" + pgkt + "}(" + gaksenx + ")\\, \\, dx = \\cdots$");
                        soal.write("\n");
                        kj.write("\\item $\\displaystyle " + jwb + "$\n");
                        i++;
                    }
                }
            }
            soal.close();
            kj.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
