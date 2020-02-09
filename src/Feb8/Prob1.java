package Feb8;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[]args){

    Scanner myScan = new Scanner(System.in);
    System.out.println("Enter C for Circle, R for Rectangle, T for Tringle");
    String shape = myScan.next();
    if (shape.equals("C")){
        //if (shape.compareToIgnoreCase("C")==0){
System.out.println("please enter radius");
    double radius=myScan.nextDouble();
    System.out.println("perimeter:"+2*3.14*radius);
}
else if ( shape.equals("R")){

    System.out.println("please enter width");
    double width=myScan.nextDouble();
    System.out.println("please enter height");
    double height=myScan.nextDouble();
    System.out.println("perimeter:"+2*(width+height));
}
    else if( shape.equals("T")){
    System.out.println("please enter edge a");
    double a=myScan.nextDouble();
    System.out.println("please enter edge b");
    double b=myScan.nextDouble();
    System.out.println("please enter edge c");
    double c=myScan.nextDouble();
    System.out.println("perimeter:"+(a+b+c));

    }
 System.out.println("please type C, T or R");
        }
}
