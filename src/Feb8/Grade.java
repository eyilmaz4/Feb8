package Feb8;

import java.util.Scanner;

public class Grade {
        public static void main(String[]args) {
            Scanner x = new Scanner(System.in);
            System.out.print("Please enter your score:");
            int score = x.nextInt();

            if (score >= 0 && score <= 49) {
                System.out.println("fail");
            } else if (score >= 50 && score <= 59) {
                System.out.println("D");
            } else if (score >= 60 && score <= 69) {
                System.out.println("C");
            } else if (score >= 70 && score <= 79) {
                System.out.println("B");
            } else if (score >= 80 && score <= 89) {
                System.out.println("A");
            } else if (score >= 90 && score <= 100) {
                System.out.println("A+");
            }
            else{
                System.out.println("you entered invalid score");
            }

        }}


