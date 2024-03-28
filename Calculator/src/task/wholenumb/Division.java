package task.wholenumb;

import task.impl.Operationable;

public class Division implements Operationable {
    @Override
    public double calculate(double x, double y) {
        return x / y;
    }
}
