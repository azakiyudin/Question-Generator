package turunan;
import classmath.cAcak;
import classmath.cPolinom2;

import java.io.FileWriter;
import java.io.IOException;

public class polinom {
    public static void main(String[] args){
        try {
            FileWriter myWriter = new FileWriter("turunanpolinom.txt");
            int i = 1;
            while(i<=1000) {
                int a = cAcak.rnd(4);
                cPolinom2 p1 = new cPolinom2(a);
                myWriter.write("\\item $\\dfrac{d}{dx} \\left[" + p1.getPolinom() + "\\right] = \\cdots $");
                myWriter.write("\n");
                i++;
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
