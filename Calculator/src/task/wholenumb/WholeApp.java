package task.wholenumb;
import task.Application;

import java.util.ArrayList;
import java.util.List;

public class WholeApp {
    private Application view = new Application();
    private String result;
    private String line;
    List<Double> operand1 = new ArrayList<>();
    List<Double> operand2 = new ArrayList<>();
    public void wholeAppRun() {
        operand1.add(Double.parseDouble(view.isNumeric(view.prompt("Enter first number: "))));
        String operator = view.prompt("Enter math operation ( +, /, *): ");
        operand2.add(Double.parseDouble(view.isNumeric(view.prompt("Enter second number: "))));
//        switch(operator){
//            case "+":
//                Addition add = new Addition();
//                result = add.calculate(operand1, operand2);
//                break;
//            case "/":
//                Division div = new Division();
//                result = div.calculate(operand1, operand2);
//                break;
//            case "*":
//                Multiplication multi = new Multiplication();
//                result = multi.calculate(operand1, operand2);
//                break;
//            default:
//                System.out.println("You have entered the Wrong operator");
//        }
        if (!operator.equals("+") & !operator.equals("*") & !operator.equals("/")){
            System.out.println("Incorrect operator. Please enter again");
            wholeAppRun();
        }else if(operator.equals("+")){
            Addition add = new Addition();
            result = add.calculate(operand1, operand2);
        }else if(operator.equals("/")) {
            Division div = new Division();
            result = div.calculate(operand1, operand2);
        }else if(operator.equals("*")){
            Multiplication multi = new Multiplication();
            result = multi.calculate(operand1, operand2);
        }
        System.out.println("Answer: " + result);
        view.run();
    }
}
