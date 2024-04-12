package task.complex;

import task.impl.Operationable;
import java.util.List;

public class ComplexusAdd implements Operationable {
    //        x = x1(1) + x2(3i) y = y1(2) + y2(i)
    @Override
    public String calculate(List<Double> x, List<Double> y) {
       String result = "";
       if((x.get(1) + y.get(1)) < 0){
           result = (x.get(0) + y.get(0)) + "" + (x.get(1) + y.get(1)) + "i";
       }else {
           result = (x.get(0) + y.get(0)) + "+" + (x.get(1) + y.get(1)) + "i";
       }
       return result;
    }
}
