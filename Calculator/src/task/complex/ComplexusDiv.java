package task.complex;

import task.impl.Operationable;
import java.util.List;

public class ComplexusDiv implements Operationable {
    @Override
    public String calculate(List<Double> x, List<Double> y) {
        String result = "";
        double temp1 = (((x.get(0) * y.get(0)) + (x.get(1) * y.get(1))) / (Math.pow(y.get(0), 2) + Math.pow(y.get(1), 2)));
        double temp2 = (((x.get(1) * y.get(0)) - (x.get(0) * y.get(1))) / (Math.pow(y.get(0), 2) + Math.pow(y.get(1), 2)));
        if((temp1 > 0 & temp2 < 0) || (temp1 < 0 & temp2 < 0)){
            result = temp1 + "" + temp2 + "i";
        }else if(temp1 == 0 & temp2 == -1){
            result = "-i";
        }else if(temp1 == 0 & temp2 == 1){
            result = "i";
        }else{
            result = temp1 + "+" + temp2 + "i";
        }
        return result;
    }
}
