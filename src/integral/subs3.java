package integral;

import classmath.cAcak;
import classmath.cPangkat;
import classmath.cPecahan;

import java.io.FileWriter;
import java.io.IOException;

public class subs3 {
    public static void main(String[] args){
        try {
            FileWriter soal = new FileWriter("int sub3.txt");
            FileWriter kj = new FileWriter("kjsub3.txt");
            int i = 1;
            while(i<=1000) {
                int n1 = cAcak.rnd(6);
                int n = n1;
                int a = cAcak.rnd(3);
                int k = cAcak.rnd(9);
                if(a!= 0 && n>=2) {
                    StringBuilder fogx = new StringBuilder(cPangkat.a0(a, n1));
                    int c = n1*a*k;
                    StringBuilder gaksenx = new StringBuilder(cPangkat.a0(c,n1-1));
                    while (n > 1) {
                        n--;
                        a = cAcak.rnd(3);
                        if (a != 0) {
                            fogx.append(cPangkat.an(a, n));
                            if (n > 1) {
                                gaksenx.append(cPangkat.an(n * a * k, n - 1));
                            } else if(n==1){
                                gaksenx.append(cPangkat.nol(n*a*k));
                            }
                        }
                    }
                    a = cAcak.rnd(3);
                    fogx.append(cPangkat.nol(k*a));
                    int pgkt = cAcak.rnd(3);
                    if(pgkt > 1) {
                        String koef = cPecahan.simpel(k,-pgkt+1);
                        int cek = k % (-pgkt+1);
                        int has = k / cPecahan.fpb(k,-pgkt+1);
                        if(cek == 0 && has>0){
                            koef = "\\dfrac{" + has + "}{}";
                        } else if(cek == 0 && has<0){
                            koef = "-\\dfrac{" + (-has) + "}{}";
                        }
                        StringBuilder koef1 = new StringBuilder(koef);
                        koef1.deleteCharAt(koef.length()-1);
                        System.out.println(koef);
                        System.out.println(koef1);
                        String jwb;
                        if (pgkt>2) {
                            jwb = koef1 + "\\left(" + fogx + "\\right)^{" + (pgkt - 1) + "}} + C";
                        } else {
                            jwb = koef1 + "\\left(" + fogx + "\\right)} + C";
                        }
                        soal.write("\\item $\\displaystyle \\int \\dfrac{"+gaksenx+"}{ \\left(" + fogx + "\\right)^{" + pgkt + "}}\\, \\, dx = \\cdots $");
                        soal.write("\n");
                        kj.write("\\item $\\displaystyle " + jwb + "$\n");
                        i++;
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
