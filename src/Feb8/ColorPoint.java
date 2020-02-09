package Feb8;
import java.util.Scanner;
public class ColorPoint {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter color Red or Blue");
        String color = myScan.nextLine();
        System.out.println("Please enter  price");
        double tagPrice = myScan.nextDouble();
        System.out.println("Please enter discount");
        double percent = myScan.nextDouble();
      int colorItem=0;

        if (color.compareToIgnoreCase("Red") == 0) {
         colorItem = 20;
        } else if (color.compareToIgnoreCase("Blue") == 0) {
            colorItem = 10;
        }
        else {
            System.out.println("enter blue or red");
        }
        int point=(int)((tagPrice*percent)-colorItem);

        if (point>=100) {
            System.out.println("dont buy");
        }
            else if (point>=50 && point<=99) {
                System.out.println("buy later");
            }
                else {
                    System.out.println("buy now");

                    }
                }
            }










