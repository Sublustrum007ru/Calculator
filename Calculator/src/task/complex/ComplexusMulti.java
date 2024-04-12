package task.complex;

import task.impl.Operationable;
import java.util.List;

public class ComplexusMulti implements Operationable {
    @Override
    public String calculate(List<Double> x, List<Double> y) {
        String result = "";
        double temp1 = ((x.get(0) * y.get(0)) - (x.get(1) * y.get(1)));
        double temp2 = ((x.get(1) * y.get(0)) + (x.get(0) * y.get(1)));
        if (temp1 == 0){
            result = temp2 + "i";
        }else if(temp2 == 0) {
            result = temp1 + "";
        }else if(temp2 < 0){
            result = temp1 + "" + temp2 + "i";
        }else{
            result = temp1 + "+" + temp2 + "i";
        }
        return result;
    }
}
