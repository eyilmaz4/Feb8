package Feb8;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[]args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Please enter year:");
        int  year= x.nextInt();

        if (year%4==0 && year%400==0 && year%100!=0){
        System.out.println("leap year");
        }
        else{
            System.out.println(" not a leap year");
        }

    }}