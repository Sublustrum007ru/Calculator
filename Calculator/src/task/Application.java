package task;

import task.wholenumb.WholeApp;
import task.complex.ComplexApp;

import java.util.Scanner;

public class Application {

    public void run() {
            String whoNumbersSystem = prompt("Enter Number System (Whole, Complex) or 'EXIT' for exiting: ").toLowerCase();
//            if (whoNumbersSystem.equals("whole")) {
//                WholeApp run = new WholeApp();
//                run.wholeAppRun();
//            } else if (whoNumbersSystem.equals("complex")) {
//                ComplexApp run = new ComplexApp();
//                run.complexAppRun();
//            }
            switch(whoNumbersSystem) {
                case "whole":
                    WholeApp wholerun = new WholeApp();
                    wholerun.wholeAppRun();
                    break;
                case "complex":
                    ComplexApp complexrun = new ComplexApp();
                    complexrun.complexAppRun();
                    break;
                case "exit":
                    System.out.println("Bay");
                    break;
                default:
                    System.out.println("Не верный ввод. Повторите попутку.");
                    run();
            }
    }

    public String prompt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    public String isNumeric(String line){
        while(true){
            try{
                Double.parseDouble(line);
                return line;
            }catch(NumberFormatException ne){
                System.out.println("Input is not number!");
                line = isNumeric(prompt("Please enter a valid number: "));
            }
        }
    }

}
