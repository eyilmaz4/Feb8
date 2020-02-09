package Feb8;
import java.util.Scanner;
public class ElectricBill {
    public static void main(String[]args){
        Scanner myScanner= new Scanner(System.in);
        System.out.print("Enter your consumption : ");
        int myConsumption=myScanner.nextInt();
        double electricBill;
        if (myConsumption<501) {
            electricBill=(myConsumption*0.3);
        }

        else if(myConsumption<1001){

           electricBill=(myConsumption*0.5);

        }
        else if(myConsumption<2001) {
            electricBill=(myConsumption*0.5);

        }
        else {
           electricBill=(myConsumption*0.6);

        }
        System.out.println(electricBill+"$");
        }
    }


