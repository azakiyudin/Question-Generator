package integral;
import classmath.cAcak;
import classmath.cPangkat;
import classmath.cPecahan;

import java.io.FileWriter;
import java.io.IOException;

public class aljabardasar {
    public static void main(String[] args){
        try {
            FileWriter soal = new FileWriter("int1.txt");
            FileWriter kj = new FileWriter("kjint1.txt");
            int i = 1;
            while(i<=1000) {
                int n1 = cAcak.rnd(4);
                int n = n1;
                int a = cAcak.rnd(3);
                if(a!= 0 && n>=2) {
                    StringBuilder polinom = new StringBuilder(cPangkat.a0(a, n1));
                    String c = cPecahan.simpel(a,(n1+1));
                    StringBuilder intpolinom = new StringBuilder();
                    if(!c.equals("1") && !c.equals("-1")){
                        intpolinom.append(c);
                    } else if (c.equals("-1")){
                        intpolinom.append("-");
                    }
                    intpolinom.append(cPangkat.a0(1,n1+1));
                    while (n > 1) {
                        n--;
                        a = cAcak.rnd(3);
                        if (a!= 0) {
                            intpolinom.append(cPecahan.simpel2(a, (n + 1)));
                            polinom.append(cPangkat.an(a, n));
                            intpolinom.append(cPangkat.a0(1, n + 1));
                        }
                    }
                    a = cAcak.rnd(3);
                    polinom.append(cPangkat.nol(a));
                    intpolinom.append(cPangkat.an(a,1));
                    intpolinom.append("+C");
                    soal.write("\\item $\\displaystyle \\int \\left(" + polinom + "\\right) \\, \\, dx = \\cdots $");
                    kj.write("\\item $\\displaystyle " + intpolinom + "$");
                    kj.write("\n");
                    soal.write("\n");
                    i++;
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
