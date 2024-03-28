package task;

import task.complex.ComplexusAdd;
import task.wholenumb.Addition;

import java.util.Scanner;

public class Application {
    public void run() {
        String whoNumbersSystem = promt("Enter Number System (Whole, complex): ");
        if(whoNumbersSystem.toLowerCase().equals("whole")){
            double operand1 = Double.parseDouble(promt("Enter first number: "));
            String operator = promt("Enter math operation ( +, /, *): ");
            double operand2 = Double.parseDouble(promt("Enter first number: "));
            if(operator.equals('+')) {
                Addition add = new Addition();
                System.out.println(add.calculate(operand1, operand2));
            }
        }
    }

    public String promt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}
