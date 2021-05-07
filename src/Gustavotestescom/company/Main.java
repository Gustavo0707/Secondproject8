package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double number1, number2, number3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type cost of the first product");
        number1 = scanner.nextDouble();

        System.out.println("Type cost of the second product");
        number2 = scanner.nextDouble();

        System.out.println("Type cost of the third product");
        number3 = scanner.nextDouble();

        if (number1 < number2 &&  number1 < number3){
            System.out.println("The better product costs" + number1);
        }
        else if (number2 < number1  && number2 < number3){
            System.out.println("the better product costs " + number2);
        }
        else if (number3 < number1 && number3 < number2){
            System.out.println("the better product costs " + number3);
        }

    }
}
