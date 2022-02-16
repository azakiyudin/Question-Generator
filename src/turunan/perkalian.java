package turunan;

import classmath.cAcak;
import classmath.cPolinom2;

import java.io.FileWriter;
import java.io.IOException;

public class perkalian {
    public static void main(String[] args){
        try {
            FileWriter myWriter = new FileWriter("turunan perkalian.txt");
            int i = 1;
            while(i<=1000) {
                int a = cAcak.rnd(4);
                cPolinom2 p1 = new cPolinom2(a);
                cPolinom2 p2 = new cPolinom2(a);
                myWriter.write("\\item $\\displaystyle \\dfrac{d}{dx} \\left(" + p1.getPolinom() + "\\right)\\left(" +
                        p2.getPolinom() + "\\right) = \\cdots $");
                myWriter.write("\n");
                i++;
            }
            i = 1;
            while(i<=1000) {
                int a = cAcak.rnd(4);
                cPolinom2 p1 = new cPolinom2(a);
                cPolinom2 p2 = new cPolinom2(a);
                int b = (int)(Math.random()*12+2);
                myWriter.write("\\item $\\displaystyle \\dfrac{d}{dx} \\left(" + p1.getPolinom() + "\\right)^{" +b + "}\\left(" +
                        p2.getPolinom() + "\\right) = \\cdots $");
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
