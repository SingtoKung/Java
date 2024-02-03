import java.io.*;

public class BufferedFile {
    public static void main(String[] args) {
        File f = new File("C:/Users/suwat/00CodePractice/Java/JavaBeginner/47_BufferedWrite-Read/Demo2.txt");

        try {
            FileWriter writer = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Hello world2 \n");
            bw.write("Java beginner");
            bw.close();
            System.out.println("Write  finished!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader(f);
            BufferedReader br = new BufferedReader(reader);
            String message = "";

            while ((message = br.readLine()) != null) {
                System.out.println(message);
            }
            
            System.out.println("Read done!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
