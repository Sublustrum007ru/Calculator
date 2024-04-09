package task.complex;

import task.impl.Operationable;
import java.util.List;

public class ComplexusAdd implements Operationable {
    //        x = x1(1) + x2(3i) y = y1(2) + y2(i)
    @Override
    public String calculate(List<Double> x, List<Double> y) {
//        if (x.get(1) == "") x.get(1) = 1.0;
//        if (y.get(1) == "") y.get(1) = 1.0;
        return "Empty";
    }
}
