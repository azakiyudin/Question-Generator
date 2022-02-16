package integral;
import classmath.cAcak;
import classmath.cPangkat;
import classmath.cPecahan;

import java.io.FileWriter;
import java.io.IOException;

public class subs9 {
    public static void main(String[] args){
        try {
            FileWriter soal = new FileWriter("int sub9.txt");
            FileWriter kj = new FileWriter("kjsub9.txt");
            int i = 1;
            while(i<=1000) {

                //bentuk ((ax+b)^2)+c)sqrt[p]{ax+b}
                int a = cAcak.rnd(6);
                int b = cAcak.rnd(2);
                int c = cAcak.rnd(3);
                int p1 = cAcak.rnd(7);
                int p2 = cAcak.rnd(7);
                int k = cAcak.rnd(10);
                if (p2 > 1 && p2>p1) {
                    StringBuilder u = new StringBuilder(cPangkat.a0(a, 1));
                    u.append(cPangkat.nol(b));
                    StringBuilder uya = new StringBuilder(cPangkat.a0(k*a * a, 2));
                    uya.append(cPangkat.an(k*a * b * 2, 1));
                    uya.append(cPangkat.nol(k*(b * b + c)));
                    String jwb1,jwb2,koef1,koef2;
                    koef1 = cPecahan.simpel(k*p2,a*(3*p2-p1));
                    if(koef1.equals("-1")){
                        koef1 = "-";
                    } else if(koef1.equals("1")){
                        koef1 = "";
                    }
                    koef2 = cPecahan.simpel(p2*k*c,a*(p2-p1));
                    if(koef2.equals("-1")){
                        koef2 = "-";
                    } else if(koef2.equals("1")){
                        koef2 = "";
                    }
                    if(k*c>0){
                        koef2 = "+" + koef2;
                    }
                    if(p2>2) {
                        jwb1 = koef1 + "\\sqrt[" + p2 + "]{(" +u + ")^{" + (3*p2-p1) + "}}";
                        if (c != 0) {
                            if (p2 - p1 != 1) {
                                jwb2 = koef2 + "\\sqrt[" + p2 + "]{(" + u + ")^{" + (p2 - p1) + "}} + C";
                            } else {
                                jwb2 = koef2 + "\\sqrt[" + p2 + "]{" + u + "} + C";
                            }
                        } else {
                            jwb2 = "+C";
                        }
                        if(p1 == 1) {
                            soal.write("\\item $\\displaystyle \\int \\dfrac{" + uya + "}{\\sqrt[" + p2 + "]{" + u + "}}\\, \\, dx = \\cdots $");
                        } else {
                            soal.write("\\item $\\displaystyle \\int \\dfrac{" + uya + "}{\\sqrt[" + p2 + "]{(" + u + ")^{" + p1 + "}}}\\, \\, dx = \\cdots $");
                        }
                    } else {
                        jwb1 = koef1 + "\\sqrt{(" +u + ")^{" + (3*p2-p1) + "}}";
                        if(c!=0) {
                            if (p2-p1 != 1) {
                                jwb2 = koef2 + "\\sqrt{(" + u + ")^{" + (p2 - p1) + "}} + C";
                            } else {
                                jwb2 = koef2 + "\\sqrt{" +u + "}+C";
                            }
                        } else {
                            jwb2 = "+C";
                        }
                        if(p1 == 1) {
                            soal.write("\\item $\\displaystyle \\int \\dfrac{" + uya + "}{\\sqrt{" + u + "}}\\, \\, dx = \\cdots $");
                        } else {
                            soal.write("\\item $\\displaystyle \\int \\dfrac{" + uya + "}{\\sqrt{(" + u + ")^{" + p1 + "}}}\\, \\, dx = \\cdots $");
                        }
                    }
                    kj.write("\\item $\\displaystyle " + jwb1 + jwb2 + "$\n");
                    soal.write("\n");
                    i++;
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
