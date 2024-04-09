package task.complex;

import task.impl.Operationable;
import java.util.List;

public class ComplexusMulti implements Operationable {
    @Override
    public String calculate(List<Double> operand1, List<Double> operand2) {
//        a+bi c+di
//        a = operand1.get(0) b = operand1.get(1)
//        c = operand2.get(0) d = operand2.get(1)
//        result = (a*c - b*d) + (b*c + a*d)i
//        result = (x1*x2 - y1*y2) + (y1*x2 + x1*y2)i
        double y1 = 1;
        double y2 = 1;
        if(operand1.get(1) != 0){
            y1 = operand1.get(1);
        }
        if(operand2.get(1) != 0){
            y2 = operand2.get(1);
        }
        double x = (operand1.get(0) * operand2.get(0)) - (y1*y2);
        double y = (y1*operand2.get(0)) + (operand1.get(0)*y2);
        return "" + x + " + " + y + "i"; // условно
    }
}
