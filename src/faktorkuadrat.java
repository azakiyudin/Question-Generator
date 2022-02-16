import classmath.cAcak;
import classmath.cPangkat2;
import classmath.cPecahan;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class faktorkuadrat {
    public static void main(String[] args){
        //bentuk (ax+b)(cx+d)

        try {
            FileWriter soal = new FileWriter("pemfaktoran kuadrat.txt");
            FileWriter kunci = new FileWriter("kj pemfaktoran kuadrat.txt");
            Random random = new Random();

            int i = 1;
            while (i <= 2000) {
                char var1 = (char) (random.nextInt(26) + 'a');
                String var = String.valueOf(var1);

                String s1, s2, kj, soall;
                int a, b, c, d, p, q, r;
                a = cAcak.rnd(11);
                b = (int) (Math.random() * 40 - 20);
                c = cAcak.rnd(11);
                d = (int) (Math.random() * 40 - 20);
                int x = cPecahan.fpb(a, b);
                int y = cPecahan.fpb(c, d);
                p = a * c;
                q = (a * d + b * c);
                r = b * d;
                boolean cekvar = !var.equals("o") && !var.equals("c") && !var.equals("e") && !var.equals("l")
                        && !var.equals("f") && !var.equals("i") && !var.equals("j");
                if(cekvar) {
                    if (x == 1 && y == 1) {
                        s1 = "(" + cPangkat2.a0(a, 1, var) + cPangkat2.nol(b) + ")";
                        s2 = "(" + cPangkat2.a0(c, 1, var) + cPangkat2.nol(d) + ")";
                        kj = s1 + s2;
                        soall = "\\item $" + cPangkat2.a0(p, 2, var) + cPangkat2.an(q, 1, var) + cPangkat2.nol(r);
                        i++;
                        soal.write(soall + "=\\cdots $\n");
                        kunci.write(soall + " = " + kj + "$\n");
                    }
                }
            }
            soal.close();
            kunci.close();
            System.out.println("Berhasilll");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
