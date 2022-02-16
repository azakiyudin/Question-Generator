package limit;

import classmath.cPangkat;
import classmath.cPecahan;

import java.io.FileWriter;
import java.io.IOException;

public class akar3 {
    public static void main(String[] args){

        //lim x-a k(x-a)/(sqrt(px+q)-r)


        try {
            FileWriter soal = new FileWriter("akar3ya.txt");
            FileWriter KJ = new FileWriter("KJakar3ya.txt");
            for(int x = 1;x<=50;x++) {
                int i = 1;
                while (i <= 5) {
                    int a, k, p, q, r, t;
                    a = (int) (Math.random() * 14 - 7);
                    k = (int) (Math.random() * 10 - 5);
                    p = (int) (Math.random() * 10 - 5);
                    r = (int) (Math.random() * 10 - 10);
                    q = r * r - p * a;
                    t = (int) Math.sqrt(a * p + q) - r;
                    int hasilpem = k * t;
                    int hasilpeny = p;
                    String pembilang = cPangkat.a0(k, 1) + cPangkat.nol(-k * a);
                    String penyebut = "\\sqrt{" + cPangkat.a0(p, 1) + cPangkat.nol(q) + "} " + cPangkat.nol(r);
                    String pembilang1 = "(x" + cPangkat.nol(-a) + ")" +
                            "(\\sqrt{" + cPangkat.a0(p, 1) + cPangkat.nol(q) + "}" + cPangkat.nol(-r) + ")";
                    if (k != 1 && k != -1) {
                        pembilang1 = k + pembilang1;
                    } else if (k == -1) {
                        pembilang1 = "-" + pembilang1;
                    }
                    String penyebut1 = "(x" + cPangkat.nol(-a) + ")";
                    if (p != 1 && p != -1) {
                        penyebut1 = p + penyebut1;
                    } else if (p == -1) {
                        penyebut1 = "-" + penyebut1;
                    }
                    if (hasilpeny != 0 && k != 0 && r != 0) {
                        soal.write("\\item $\\displaystyle \\lim_{x\\rightarrow " + a + "} \\dfrac{" + pembilang + "}{" + penyebut
                                + "}=\\cdots $");
                        soal.write("\n");
                        KJ.write("\\item $\\displaystyle \\lim_{x\\rightarrow " + a + "} \\dfrac{" + pembilang + "}{" + penyebut +
                                "} = \\lim_{x\\rightarrow " + a + "} \\dfrac{" + pembilang1 + "}{" + penyebut1 +
                                "} = " +
                                cPecahan.simpel(hasilpem, hasilpeny) + "$");
                        KJ.write("\n");
                        i++;
                    }
                }
                i = 1;
                while (i <= 5) {
                    int a, k, p, q, r, t;
                    a = (int) (Math.random() * 14 - 7);
                    k = (int) (Math.random() * 10 - 5);
                    p = (int) (Math.random() * 10 - 5);
                    r = (int) (Math.random() * 10 - 10);
                    q = r * r - p * a;
                    t = (int) Math.sqrt(a * p + q) - r;
                    int hasilpeny = k * t;
                    int hasilpem = p;
                    String penyebut = cPangkat.a0(k, 1) + cPangkat.nol(-k * a);
                    String pembilang = "\\sqrt{" + cPangkat.a0(p, 1) + cPangkat.nol(q) + "} " + cPangkat.nol(r);
                    String penyebut1 = "(x" + cPangkat.nol(-a) + ")" +
                            "(\\sqrt{" + cPangkat.a0(p, 1) + cPangkat.nol(q) + "}" + cPangkat.nol(-r) + ")";
                    if (k != 1 && k != -1) {
                        penyebut1 = k + penyebut1;
                    } else if (k == -1) {
                        penyebut1 = "-" + penyebut1;
                    }
                    String pembilang1 = "(x" + cPangkat.nol(-a) + ")";
                    if (p != 1 && p != -1) {
                        pembilang1 = p + pembilang1;
                    } else if (p == -1) {
                        pembilang1 = "-" + pembilang1;
                    }
                    if (hasilpeny != 0 && k != 0 && r != 0 && p != 0) {
                        soal.write("\\item $\\displaystyle \\lim_{x\\rightarrow " + a + "} \\dfrac{" + pembilang + "}{" + penyebut
                                + "}=\\cdots $");
                        soal.write("\n");
                        KJ.write("\\item $\\displaystyle \\lim_{x\\rightarrow " + a + "} \\dfrac{" + pembilang + "}{" + penyebut +
                                "} = \\lim_{x\\rightarrow " + a + "} \\dfrac{" + pembilang1 + "}{" + penyebut1 +
                                "} = " +
                                cPecahan.simpel(hasilpem, hasilpeny) + "$");
                        KJ.write("\n");
                        i++;
                    }
                }
            }
            soal.close();
            KJ.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
