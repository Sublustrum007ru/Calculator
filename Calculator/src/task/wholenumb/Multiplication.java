package task.wholenumb;

import task.impl.Operationable;

public class Multiplication implements Operationable {
    @Override
    public double calculate(double x, double y) {
        return x * y;
    }
}
