import java.io.FileWriter;
import java.io.IOException;

public class kurangan {
    public static void main(String[] args){
        try {
            FileWriter myWriter = new FileWriter("pengurangan.txt");
            int i = 1;
            while(i<=15) {
                int a = (int)(Math.random()*50);
                int b = (int)(Math.random()*50);
                if (a>b) {
                    myWriter.write("\\item $" + a + " - " + b + " = ... $");
                    myWriter.write("\n");
                    i++;
                }
            }
            i=1;
            while(i<=15) {
                int a = (int)(Math.random()*50);
                int b = (int)(Math.random()*50);
                if (a>b) {
                    myWriter.write("\\item $" + a + " - ... = " + b + "$");
                    myWriter.write("\n");
                    i++;
                }
            }
            i=1;
            while(i<=15) {
                int a = (int)(Math.random()*50);
                int b = (int)(Math.random()*50);
                    myWriter.write("\\item $ ... - " + a + " = " + b + "$");
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
