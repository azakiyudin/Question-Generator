package limit;

import classmath.cPecahan;
import classmath.cPolinom2;

import java.io.FileWriter;
import java.io.IOException;
public class akartakhingga2 {
    public static void main(String[] args){

        //lim x-inf \sqrt(ax^2+bx+c) - (mx+n)



        try {
            FileWriter myWriter = new FileWriter("bentuk akar2.txt");
            FileWriter kunci = new FileWriter("kunci akar2.txt");
            //bentuk sqrt(ax^2+bx+c)-mx+n
            for(int i = 0; i<5;i++) {
                int a1, b1, a2, b2, a3, b3;
                cPolinom2 p1 = new cPolinom2(2, '+');
                a2 = p1.getano(2);
                b1 = p1.getano(1);
                cPolinom2 p2 = new cPolinom2(a2,2);
                b2 = p2.getano(1);
//                String kode = "\\item $\\displaystyle \\lim_{x\\rightarrow \\infty}\\left(\\sqrt{" +
//                        p2.getPolinom() + "}" + p1.getPolinom() + "\\right) = ...$\n";
//                myWriter.write(kode);
                System.out.println(p1.getPolinom());
                System.out.println(p2.getPolinom());

            }


            myWriter.close();
            kunci.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static String hasil(int a, int b, int q){
        int pembilang = b-q;
        int penyebut = (int) (2*Math.sqrt(a));
        return cPecahan.simpel(pembilang,penyebut);
    }
}
