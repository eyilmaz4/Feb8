package Feb8;
import java.util.Scanner;
public class Gender {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println(" Please enter gender M or F");
        String gender = myScan.next();

        if (gender.equals("M")) {
            System.out.println("male");
        } else if (gender.equals("F")) {
            System.out.println("female");

        } else {
            System.out.println("Plese M or F");
        }
    }
}


