import java.io.*;

public class FileWriteRead {
    public static void main(String[] args) {
        File f = new File("C:/Users/suwat/00CodePractice/Java/JavaBeginner/46_FileWrite-Read/Demo1.txt");

        try {
            FileWriter writer = new FileWriter(f);
            writer.write("Hello world");
            writer.close();
            System.out.println("Write  finished!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader(f);
            int data;

            while ((data = reader.read()) != -1) {
                System.out.printf("%c\n", data);
            }
            
            System.out.println("Read done!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
