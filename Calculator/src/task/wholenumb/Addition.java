package task.wholenumb;

import task.impl.Operationable;
import java.util.List;

public class Addition implements Operationable{
        @Override
        public String calculate(List<Double> x, List<Double> y) {
            double result = x.get(0) + y.get(0);
            return "" + result; // условно
        }
    }


