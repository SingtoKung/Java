import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class Grade {
    public static void main(String[] args) {
        PrintWriter output = null;
        try {
            Scanner input = new Scanner(new File("Score.txt"));
            output = new PrintWriter("Grade.txt");

            String nisit = "";
            String gradeString = "";

            while (input.hasNext()) {
                nisit = input.nextLine();
                int pos = nisit.indexOf(" ");
                String score = nisit.substring(pos, nisit.length());
                score = score.trim();

                double scoreDouble = Double.parseDouble(score);

                if (scoreDouble > 80) {
                    gradeString = "A";
                } else if (scoreDouble > 70) {
                    gradeString = "B";
                } else if (scoreDouble > 60) {
                    gradeString = "C";
                } else if (scoreDouble > 50) {
                    gradeString = "D";
                } else {
                    gradeString = "F";
                }

                System.out.println(nisit + "\t Grade: " + gradeString);
                output.println(nisit + "\t Grade: " + gradeString);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        output.close();
        
    }
}
