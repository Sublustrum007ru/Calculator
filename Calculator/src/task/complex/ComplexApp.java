package task.complex;

import task.Application;

import java.util.ArrayList;
import java.util.List;

public class ComplexApp {
    private Application view = new Application();
    private String result;
    List<Double> operand1 = new ArrayList<>();
    List<Double> operand2 = new ArrayList<>();
        public void complexAppRun() {
            operand1.add(Double.parseDouble(view.isNumeric(view.prompt("Enter first number: "))));
            operand1.add(Double.parseDouble(view.isNumeric(view.prompt("Enter first 'i': "))));
            String operator = view.prompt("Enter math operation ( +, /, *): ");
            operand2.add(Double.parseDouble(view.isNumeric(view.prompt("Enter second number: "))));
            operand2.add(Double.parseDouble(view.isNumeric(view.prompt("Enter second 'i': "))));

            if (!operator.equals("+") & !operator.equals("*") & !operator.equals("/")){
                System.out.println("Incorrect operator. Please enter again");
                complexAppRun();
            }else if(operator.equals("+")) {
                ComplexusAdd add = new ComplexusAdd();
                result = add.calculate(operand1, operand2);
            }else if(operator.equals("*")){
                ComplexusMulti multi = new ComplexusMulti();
                result = multi.calculate(operand1, operand2);
            }else if (operator.equals("/")){
                ComplexusDiv div = new ComplexusDiv();
                result = div.calculate(operand1, operand2);
            }

            System.out.println("Answer: " + result);
            view.run();

    }
}
