package task.wholenumb;
import task.Application;

import java.util.ArrayList;
import java.util.List;

public class WholeApp {
    private Application promt = new Application();
    private Application run = new Application();
    private String result;
    List<Double> operand1 = new ArrayList<>();
    List<Double> operand2 = new ArrayList<>();
    public void wholeAppRun() {
        operand1.add(Double.parseDouble(promt.promt("Enter first number: ")));
        String operator = promt.promt("Enter math operation ( +, /, *): ");
        operand2.add(Double.parseDouble(promt.promt("Enter second number: ")));
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
        if(operator.equals("+")){
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
        run.run();
    }
}
