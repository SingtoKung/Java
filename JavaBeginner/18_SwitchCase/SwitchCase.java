import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        switch (Check condition) {
            case (value 1) : Condition 1;
                break;
            case (value 2) : Condition 2;
                break;
                ....
            case (value n) : Condition n;
                break;
            
            default : Condition when value doesn't match any case
        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input number to find month: ");
        int month = sc.nextInt();

        String result = "";

        switch (month) {
            case 1:
                result = "January";
                break;

            case 2:
                result = "February";
                break;

            case 3:
                result = "March";
                break;
            
            case 4:
                result = "April";
                break;

            case 5:
                result = "May";
                break;

            case 6:
                result = "June";
                break;

            case 7:
                result = "July";
                break;

            case 8:
                result = "August";
                break;

            case 9:
                result = "September";
                break;
                
            case 10:
                result = "October";
                break;

            case 11:
                result = "November";
                break;

            case 12:
                result = "December";
                break;

            default:
                result = "ERROR!";
                break;
        }

        System.out.println(result);
    }
}
