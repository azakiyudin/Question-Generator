package integral;

import classmath.cAcak;
import classmath.cPangkat;
import classmath.cPecahan;

import java.io.FileWriter;
import java.io.IOException;

public class subs7 {
    public static void main(String[] args){
        try {
            FileWriter soal = new FileWriter("int sub7.txt");
            FileWriter kj = new FileWriter("kjsub7.txt");
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
                    int p2 = cAcak.rnd(4);
                    int p1 = cAcak.rnd(4);
                    if (p2 > 1 && p2!=p1 && p1>1) {
                        String koef = cPecahan.simpel(k * p2, p2 - p1);
                        String koefii = koef;
                        int cek = (k * p2) % (p2 - p1);
                        int has = (k * p2) / cPecahan.fpb(k * p2, p2 - p1);
                        if (cek == 0 && has > 0) {
                            koef = "\\dfrac{" + has + "}{}";
                        } else if (cek == 0 && has < 0) {
                            koef = "-\\dfrac{" + (-has) + "}{}";
                        }
                        StringBuilder koef1 = new StringBuilder(koef);
                        koef1.deleteCharAt(koef.length() - 1);
                        if(koefii.equals("-1")){
                            koefii = "-";
                        } else if(koefii.equals("1")){
                            koefii = "";
                        }
                        String jwb;
                        if (p2 > 2) {
                            if(p1-p2 != 1 && p2-p1 != 1) {
                                if (p1 > p2) {
                                    jwb = koef1 + "\\sqrt[" + p2 + "]{\\left(" + fogx + "\\right)^{" + (p1 - p2) + "}}} + C";
                                } else {
                                    jwb = koefii + "\\sqrt[" + p2 + "]{\\left(" + fogx + "\\right)^{" + (p2 - p1) + "}} + C";
                                }
                            } else {
                                if (p1 > p2) {
                                    jwb = koef1 + "\\sqrt[" + p2 + "]{" + fogx + "}} + C";
                                } else {
                                    jwb = koefii + "\\sqrt[" + p2 + "]{" + fogx + "} + C";
                                }
                            }
                            soal.write("\\item $\\displaystyle \\int \\dfrac{" + gaksenx + "}{\\sqrt[" + p2 + "]{\\left(" + fogx + "\\right)^{" + p1 + "}}}\\, \\, dx = \\cdots $");
                        } else {
                            if(p1-p2 !=1) {
                                jwb = koefii + "\\sqrt{\\left(" + fogx + "\\right)^{" + (p1 - p2) + "}} + C";
                            } else {
                                jwb = koefii + "\\sqrt{" + fogx + "} + C";
                            }
                            soal.write("\\item $\\displaystyle \\int \\dfrac{" + gaksenx + "}{\\sqrt{\\left(" + fogx + "\\right)^{" + p1 + "}}}\\, \\, dx = \\cdots $");
                        }
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
