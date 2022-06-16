import Operators.divide;
import Operators.multipy;
import Operators.sub;
import Operators.sum;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean reStart = true;
        int option;
        String cont;
        while (reStart) {

            System.out.println("Please type the first number: ");
            double num1 = scan.nextDouble();
            System.out.print("> Type [1] for addition (+)\n" +
                    "> Type [2] for subtraction (-)\n" +
                    "> Type [3] for multiplication (*)\n" +
                    "> Type [4] for division (/) \n");
            option = scan.nextInt();

            System.out.println("Please type the second number: ");
            double num2 = scan.nextDouble();
            if(option == 1){
                sum add = new sum(num1, num2);
                System.out.println(add.operation(num1, num2));
            }
            else if (option == 2) {
                sub subs = new sub(num1, num2);
                System.out.println(subs.operation(num1, num2));
            }
            else if (option == 3){
                multipy mult = new multipy(num1, num2);
                System.out.println(mult.operation(num1, num2));
            }
            else if(option == 4){
                if (num2 == 0){
                    System.out.println("You cannot divide by zero >:(");
                }
                else{
                    divide div = new divide(num1, num2);
                    System.out.println(div.operation(num1, num2));}
            }
            System.out.println("continue or quit");
            cont = scan.next().toLowerCase();
            if (cont.equals("continue")) {
                reStart = true;
            }
            else if (cont.equals("quit")){
                reStart = false;
                break;
            }
        }
    }
}