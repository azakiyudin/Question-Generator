package turunan;

import classmath.cAcak;
import classmath.cPolinom2;

import java.io.FileWriter;
import java.io.IOException;

public class pembagian {
    public static void main(String[] args){
        try {
            FileWriter myWriter = new FileWriter("turunan pembagian.txt");
            int i = 1;
            while(i<=1000) {
                int a = cAcak.rnd(4);
                int b = cAcak.rnd(6);
                cPolinom2 p1 = new cPolinom2(a);
                cPolinom2 p2 = new cPolinom2(b);
                myWriter.write("\\item $\\displaystyle \\dfrac{d}{dx} \\left[\\dfrac{" + p1.getPolinom() + "}{" +
                        p2.getPolinom()+"}\\right] = ....$");
                myWriter.write("\n");
                i++;
            }
            i = 1;
            while(i<=1000) {
                int a = cAcak.rnd(4);
                int b = cAcak.rnd(6);
                cPolinom2 p1 = new cPolinom2(a);
                cPolinom2 p2 = new cPolinom2(b);
                int c = (int)(Math.random()*12+2);
                myWriter.write("\\item $\\displaystyle \\dfrac{d}{dx} \\left[\\dfrac{" + p1.getPolinom() + "}{(" +
                        p2.getPolinom()+")^{"+ c +"}}\\right] = ....$");
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
